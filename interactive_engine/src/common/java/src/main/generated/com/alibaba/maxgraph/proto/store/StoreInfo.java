// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta_service.proto

package com.alibaba.maxgraph.proto.store;

/**
 * Protobuf type {@code maxgraph_store.StoreInfo}
 */
public  final class StoreInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maxgraph_store.StoreInfo)
    StoreInfoOrBuilder {
  // Use StoreInfo.newBuilder() to construct.
  private StoreInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreInfo() {
    id_ = 0;
    ip_ = "";
    port_ = 0;
    partitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StoreInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 24: {

            port_ = input.readInt32();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              partitions_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000008;
            }
            partitions_.add(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
              partitions_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              partitions_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        partitions_ = java.util.Collections.unmodifiableList(partitions_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.store.MetaServiceOuterClass.internal_static_maxgraph_store_StoreInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.store.MetaServiceOuterClass.internal_static_maxgraph_store_StoreInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.store.StoreInfo.class, com.alibaba.maxgraph.proto.store.StoreInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int IP_FIELD_NUMBER = 2;
  private volatile java.lang.Object ip_;
  /**
   * <code>optional string ip = 2;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ip = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 3;
  private int port_;
  /**
   * <code>optional int32 port = 3;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int PARTITIONS_FIELD_NUMBER = 4;
  private java.util.List<java.lang.Integer> partitions_;
  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  public java.util.List<java.lang.Integer>
      getPartitionsList() {
    return partitions_;
  }
  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  public int getPartitions(int index) {
    return partitions_.get(index);
  }
  private int partitionsMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ip_);
    }
    if (port_ != 0) {
      output.writeInt32(3, port_);
    }
    if (getPartitionsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(partitionsMemoizedSerializedSize);
    }
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeInt32NoTag(partitions_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ip_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, port_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < partitions_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(partitions_.get(i));
      }
      size += dataSize;
      if (!getPartitionsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      partitionsMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.store.StoreInfo)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.store.StoreInfo other = (com.alibaba.maxgraph.proto.store.StoreInfo) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getIp()
        .equals(other.getIp());
    result = result && (getPort()
        == other.getPort());
    result = result && getPartitionsList()
        .equals(other.getPartitionsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.store.StoreInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.store.StoreInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code maxgraph_store.StoreInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maxgraph_store.StoreInfo)
      com.alibaba.maxgraph.proto.store.StoreInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.store.MetaServiceOuterClass.internal_static_maxgraph_store_StoreInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.store.MetaServiceOuterClass.internal_static_maxgraph_store_StoreInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.store.StoreInfo.class, com.alibaba.maxgraph.proto.store.StoreInfo.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.store.StoreInfo.newBuilder()
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
    public Builder clear() {
      super.clear();
      id_ = 0;

      ip_ = "";

      port_ = 0;

      partitions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.store.MetaServiceOuterClass.internal_static_maxgraph_store_StoreInfo_descriptor;
    }

    public com.alibaba.maxgraph.proto.store.StoreInfo getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.store.StoreInfo.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.store.StoreInfo build() {
      com.alibaba.maxgraph.proto.store.StoreInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.store.StoreInfo buildPartial() {
      com.alibaba.maxgraph.proto.store.StoreInfo result = new com.alibaba.maxgraph.proto.store.StoreInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.ip_ = ip_;
      result.port_ = port_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        partitions_ = java.util.Collections.unmodifiableList(partitions_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.partitions_ = partitions_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.store.StoreInfo) {
        return mergeFrom((com.alibaba.maxgraph.proto.store.StoreInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.store.StoreInfo other) {
      if (other == com.alibaba.maxgraph.proto.store.StoreInfo.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.partitions_.isEmpty()) {
        if (partitions_.isEmpty()) {
          partitions_ = other.partitions_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensurePartitionsIsMutable();
          partitions_.addAll(other.partitions_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.store.StoreInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.store.StoreInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ip_ = "";
    /**
     * <code>optional string ip = 2;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ip = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ip = 2;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 2;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ip = 2;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>optional int32 port = 3;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>optional int32 port = 3;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 port = 3;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> partitions_ = java.util.Collections.emptyList();
    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        partitions_ = new java.util.ArrayList<java.lang.Integer>(partitions_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public java.util.List<java.lang.Integer>
        getPartitionsList() {
      return java.util.Collections.unmodifiableList(partitions_);
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public int getPartitionsCount() {
      return partitions_.size();
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public int getPartitions(int index) {
      return partitions_.get(index);
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public Builder setPartitions(
        int index, int value) {
      ensurePartitionsIsMutable();
      partitions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public Builder addPartitions(int value) {
      ensurePartitionsIsMutable();
      partitions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public Builder addAllPartitions(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePartitionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partitions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 4;</code>
     */
    public Builder clearPartitions() {
      partitions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:maxgraph_store.StoreInfo)
  }

  // @@protoc_insertion_point(class_scope:maxgraph_store.StoreInfo)
  private static final com.alibaba.maxgraph.proto.store.StoreInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.store.StoreInfo();
  }

  public static com.alibaba.maxgraph.proto.store.StoreInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreInfo>
      PARSER = new com.google.protobuf.AbstractParser<StoreInfo>() {
    public StoreInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoreInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoreInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreInfo> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.store.StoreInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
