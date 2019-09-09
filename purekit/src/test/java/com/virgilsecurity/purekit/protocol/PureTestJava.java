package com.virgilsecurity.purekit.protocol;

import com.virgilsecurity.purekit.data.ProtocolException;
import com.virgilsecurity.purekit.data.ProtocolHttpException;
import com.virgilsecurity.purekit.pure.*;
import com.virgilsecurity.purekit.utils.PropertyManager;
import com.virgilsecurity.purekit.utils.ThreadUtils;
import com.virgilsecurity.sdk.crypto.KeyType;
import com.virgilsecurity.sdk.crypto.VirgilCrypto;
import com.virgilsecurity.sdk.crypto.VirgilKeyPair;
import com.virgilsecurity.sdk.crypto.exceptions.CryptoException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PureTestJava {

    static class RamStorage implements PureStorage {

        private HashMap<String, UserRecord> users;
        private HashMap<String, HashMap<String, CellKey>> keys;

        public RamStorage() {
            this.users = new HashMap<>();
            this.keys = new HashMap<>();
        }

        @Override
        public void insertUser(UserRecord userRecord) {
            this.users.put(userRecord.getUserId(), userRecord);
        }

        @Override
        public void updateUser(UserRecord userRecord) {
            this.users.put(userRecord.getUserId(), userRecord);
        }

        @Override
        public UserRecord selectUser(String userId) {
            return this.users.get(userId);
        }

        public static Predicate<UserRecord> isVersion(Integer version) {
            return p -> p.getPheRecordVersion() == version;
        }

        @Override
        public UserRecord[] selectUsers(int pheRecordVersion) {
            Collection<UserRecord> records = this.users.values();
            records.removeIf(isVersion(pheRecordVersion));

            return records.toArray(new UserRecord[0]);
        }

        @Override
        public CellKey selectKey(String userId, String dataId) {
            HashMap<String, CellKey> map = this.keys.get(userId);

            return map.get(dataId);
        }

        @Override
        public void insertKey(String userId, String dataId, byte[] cpk, byte[] encryptedCsk) {
            HashMap<String, CellKey> map = this.keys.getOrDefault(userId, new HashMap<>());

            CellKey cellKey = new CellKey();
            cellKey.setEncryptedCsk(encryptedCsk);
            cellKey.setCpk(cpk);

            map.put(dataId, cellKey);

            this.keys.put(userId, map);
        }

        @Override
        public void updateKey(String userId, String dataId, byte[] encryptedCsk) {
            HashMap<String, CellKey> map = this.keys.get(userId);

            CellKey cellKey = map.get(dataId);

            cellKey.setEncryptedCsk(encryptedCsk);
        }
    }

    private Pure setupPure(String serverAddress,
                           String appToken,
                           String publicKey,
                           String secretKey) throws CryptoException {
        PureContext context = new PureContext();

        VirgilCrypto crypto = new VirgilCrypto();

        VirgilKeyPair bupkp = crypto.generateKeyPair(KeyType.ED25519);
        VirgilKeyPair hkp = crypto.generateKeyPair(KeyType.ED25519);

        byte[] ak = crypto.generateRandomData(32);

        context.setServiceAddress(serverAddress);
        context.setAk(ak);
        context.setAppSecretKey(secretKey);
        context.setServicePublicKey(publicKey);
        context.setAuthToken(appToken);
        context.setBuppk(crypto.exportPublicKey(bupkp.getPublicKey()));
        context.setHpk(crypto.exportPublicKey(hkp.getPublicKey()));

        RamStorage storage = new RamStorage();
        context.setStorage(storage);

        return new Pure(context);
    }

    @ParameterizedTest @MethodSource("testArgumentsNoToken")
    void register(String serverAddress,
                  String appToken,
                  String publicKey,
                  String secretKey) throws InterruptedException, ProtocolException, ExecutionException {
        ThreadUtils.pause();

        try {
            Pure pure = this.setupPure(serverAddress, appToken, publicKey, secretKey);

            String userId = UUID.randomUUID().toString();
            String password = UUID.randomUUID().toString();

            pure.registerUser(userId, password);
        }
        catch (Exception | ProtocolHttpException e) {
            fail(e);
        }
    }

    @ParameterizedTest @MethodSource("testArgumentsNoToken")
    void authenticate(String serverAddress,
                      String appToken,
                      String publicKey,
                      String secretKey) throws InterruptedException, ProtocolException, ExecutionException {
        ThreadUtils.pause();

        try {
            Pure pure = this.setupPure(serverAddress, appToken, publicKey, secretKey);

            String userId = UUID.randomUUID().toString();
            String password = UUID.randomUUID().toString();

            pure.registerUser(userId, password);

            AuthResult authResult = pure.authenticateUser(userId, password);

            assertNotNull(authResult.getEncryptedGrant());

            PureGrant grant = authResult.getGrant();
            assertNotNull(grant);

            assertEquals(userId, grant.getUserId());
            assertNull(grant.getSessionId());
            assertNotNull(grant.getUkp());
            assertNotNull(grant.getCreationDate());
        }
        catch (Exception | ProtocolHttpException e) {
            fail(e);
        }
    }


    @ParameterizedTest @MethodSource("testArgumentsNoToken")
    void encrypt_decrypt(String serverAddress,
                         String appToken,
                         String publicKey,
                         String secretKey) throws InterruptedException, ProtocolException, ExecutionException {
        ThreadUtils.pause();

        try {
            Pure pure = this.setupPure(serverAddress, appToken, publicKey, secretKey);

            String userId = UUID.randomUUID().toString();
            String password = UUID.randomUUID().toString();
            String dataId = UUID.randomUUID().toString();
            byte[] text = UUID.randomUUID().toString().getBytes();

            pure.registerUser(userId, password);

            AuthResult authResult = pure.authenticateUser(userId, password);

            byte[] cipherText = pure.encrypt(userId, dataId, text);

            byte[] plainText = pure.decrypt(authResult.getGrant(), null, dataId, cipherText);

            assertArrayEquals(text, plainText);
        }
        catch (Exception | ProtocolHttpException e) {
            fail(e);
        }
    }

    private static Stream<Arguments> testArgumentsNoToken() {
        return Stream.of(
                Arguments.of(PropertyManager.getVirgilServerAddress(),
                        PropertyManager.getVirgilAppToken(),
                        PropertyManager.getVirgilPublicKeyNew(),
                        PropertyManager.getVirgilSecretKeyNew())
        );
    }
}