// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: purekitV3_crypto.proto

package com.virgilsecurity.purekit.protobuf.build;

public final class PurekitProtosV3Crypto {
  private PurekitProtosV3Crypto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnrollmentRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:build.EnrollmentRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes ns = 1;</code>
     */
    com.google.protobuf.ByteString getNs();

    /**
     * <code>bytes nc = 2;</code>
     */
    com.google.protobuf.ByteString getNc();

    /**
     * <code>bytes t0 = 3;</code>
     */
    com.google.protobuf.ByteString getT0();

    /**
     * <code>bytes t1 = 4;</code>
     */
    com.google.protobuf.ByteString getT1();
  }
  /**
   * Protobuf type {@code build.EnrollmentRecord}
   */
  public  static final class EnrollmentRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:build.EnrollmentRecord)
      EnrollmentRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnrollmentRecord.newBuilder() to construct.
    private EnrollmentRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnrollmentRecord() {
      ns_ = com.google.protobuf.ByteString.EMPTY;
      nc_ = com.google.protobuf.ByteString.EMPTY;
      t0_ = com.google.protobuf.ByteString.EMPTY;
      t1_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnrollmentRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnrollmentRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {

              ns_ = input.readBytes();
              break;
            }
            case 18: {

              nc_ = input.readBytes();
              break;
            }
            case 26: {

              t0_ = input.readBytes();
              break;
            }
            case 34: {

              t1_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.internal_static_build_EnrollmentRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.internal_static_build_EnrollmentRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.class, com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.Builder.class);
    }

    public static final int NS_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString ns_;
    /**
     * <code>bytes ns = 1;</code>
     */
    public com.google.protobuf.ByteString getNs() {
      return ns_;
    }

    public static final int NC_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString nc_;
    /**
     * <code>bytes nc = 2;</code>
     */
    public com.google.protobuf.ByteString getNc() {
      return nc_;
    }

    public static final int T0_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString t0_;
    /**
     * <code>bytes t0 = 3;</code>
     */
    public com.google.protobuf.ByteString getT0() {
      return t0_;
    }

    public static final int T1_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString t1_;
    /**
     * <code>bytes t1 = 4;</code>
     */
    public com.google.protobuf.ByteString getT1() {
      return t1_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!ns_.isEmpty()) {
        output.writeBytes(1, ns_);
      }
      if (!nc_.isEmpty()) {
        output.writeBytes(2, nc_);
      }
      if (!t0_.isEmpty()) {
        output.writeBytes(3, t0_);
      }
      if (!t1_.isEmpty()) {
        output.writeBytes(4, t1_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!ns_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, ns_);
      }
      if (!nc_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, nc_);
      }
      if (!t0_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, t0_);
      }
      if (!t1_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, t1_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord)) {
        return super.equals(obj);
      }
      com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord other = (com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord) obj;

      if (!getNs()
          .equals(other.getNs())) return false;
      if (!getNc()
          .equals(other.getNc())) return false;
      if (!getT0()
          .equals(other.getT0())) return false;
      if (!getT1()
          .equals(other.getT1())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NS_FIELD_NUMBER;
      hash = (53 * hash) + getNs().hashCode();
      hash = (37 * hash) + NC_FIELD_NUMBER;
      hash = (53 * hash) + getNc().hashCode();
      hash = (37 * hash) + T0_FIELD_NUMBER;
      hash = (53 * hash) + getT0().hashCode();
      hash = (37 * hash) + T1_FIELD_NUMBER;
      hash = (53 * hash) + getT1().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code build.EnrollmentRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:build.EnrollmentRecord)
        com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.internal_static_build_EnrollmentRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.internal_static_build_EnrollmentRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.class, com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.Builder.class);
      }

      // Construct using com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ns_ = com.google.protobuf.ByteString.EMPTY;

        nc_ = com.google.protobuf.ByteString.EMPTY;

        t0_ = com.google.protobuf.ByteString.EMPTY;

        t1_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.internal_static_build_EnrollmentRecord_descriptor;
      }

      @java.lang.Override
      public com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord getDefaultInstanceForType() {
        return com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.getDefaultInstance();
      }

      @java.lang.Override
      public com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord build() {
        com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord buildPartial() {
        com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord result = new com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord(this);
        result.ns_ = ns_;
        result.nc_ = nc_;
        result.t0_ = t0_;
        result.t1_ = t1_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord) {
          return mergeFrom((com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord other) {
        if (other == com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord.getDefaultInstance()) return this;
        if (other.getNs() != com.google.protobuf.ByteString.EMPTY) {
          setNs(other.getNs());
        }
        if (other.getNc() != com.google.protobuf.ByteString.EMPTY) {
          setNc(other.getNc());
        }
        if (other.getT0() != com.google.protobuf.ByteString.EMPTY) {
          setT0(other.getT0());
        }
        if (other.getT1() != com.google.protobuf.ByteString.EMPTY) {
          setT1(other.getT1());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString ns_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes ns = 1;</code>
       */
      public com.google.protobuf.ByteString getNs() {
        return ns_;
      }
      /**
       * <code>bytes ns = 1;</code>
       */
      public Builder setNs(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ns_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes ns = 1;</code>
       */
      public Builder clearNs() {
        
        ns_ = getDefaultInstance().getNs();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString nc_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes nc = 2;</code>
       */
      public com.google.protobuf.ByteString getNc() {
        return nc_;
      }
      /**
       * <code>bytes nc = 2;</code>
       */
      public Builder setNc(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes nc = 2;</code>
       */
      public Builder clearNc() {
        
        nc_ = getDefaultInstance().getNc();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString t0_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes t0 = 3;</code>
       */
      public com.google.protobuf.ByteString getT0() {
        return t0_;
      }
      /**
       * <code>bytes t0 = 3;</code>
       */
      public Builder setT0(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        t0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes t0 = 3;</code>
       */
      public Builder clearT0() {
        
        t0_ = getDefaultInstance().getT0();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString t1_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes t1 = 4;</code>
       */
      public com.google.protobuf.ByteString getT1() {
        return t1_;
      }
      /**
       * <code>bytes t1 = 4;</code>
       */
      public Builder setT1(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        t1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes t1 = 4;</code>
       */
      public Builder clearT1() {
        
        t1_ = getDefaultInstance().getT1();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:build.EnrollmentRecord)
    }

    // @@protoc_insertion_point(class_scope:build.EnrollmentRecord)
    private static final com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord();
    }

    public static com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnrollmentRecord>
        PARSER = new com.google.protobuf.AbstractParser<EnrollmentRecord>() {
      @java.lang.Override
      public EnrollmentRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnrollmentRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnrollmentRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnrollmentRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.virgilsecurity.purekit.protobuf.build.PurekitProtosV3Crypto.EnrollmentRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_build_EnrollmentRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_build_EnrollmentRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026purekitV3_crypto.proto\022\005build\"B\n\020Enrol" +
      "lmentRecord\022\n\n\002ns\030\001 \001(\014\022\n\n\002nc\030\002 \001(\014\022\n\n\002t" +
      "0\030\003 \001(\014\022\n\n\002t1\030\004 \001(\014BB\n)com.virgilsecurit" +
      "y.purekit.protobuf.buildB\025PurekitProtosV" +
      "3Cryptob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_build_EnrollmentRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_build_EnrollmentRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_build_EnrollmentRecord_descriptor,
        new java.lang.String[] { "Ns", "Nc", "T0", "T1", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
