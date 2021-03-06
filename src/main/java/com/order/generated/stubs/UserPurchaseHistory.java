// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.order.generated.stubs;

/**
 * Protobuf type {@code order.UserPurchaseHistory}
 */
public  final class UserPurchaseHistory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:order.UserPurchaseHistory)
    UserPurchaseHistoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserPurchaseHistory.newBuilder() to construct.
  private UserPurchaseHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserPurchaseHistory() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserPurchaseHistory(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            com.order.generated.stubs.UserDetails.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.order.generated.stubs.UserDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              products_ = new java.util.ArrayList<com.order.generated.stubs.ProductDetails>();
              mutable_bitField0_ |= 0x00000002;
            }
            products_.add(
                input.readMessage(com.order.generated.stubs.ProductDetails.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.order.generated.stubs.Order.internal_static_order_UserPurchaseHistory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.order.generated.stubs.Order.internal_static_order_UserPurchaseHistory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.order.generated.stubs.UserPurchaseHistory.class, com.order.generated.stubs.UserPurchaseHistory.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.order.generated.stubs.UserDetails user_;
  /**
   * <code>.order.UserDetails user = 1;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.order.UserDetails user = 1;</code>
   */
  public com.order.generated.stubs.UserDetails getUser() {
    return user_ == null ? com.order.generated.stubs.UserDetails.getDefaultInstance() : user_;
  }
  /**
   * <code>.order.UserDetails user = 1;</code>
   */
  public com.order.generated.stubs.UserDetailsOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int PRODUCTS_FIELD_NUMBER = 2;
  private java.util.List<com.order.generated.stubs.ProductDetails> products_;
  /**
   * <code>repeated .order.ProductDetails products = 2;</code>
   */
  public java.util.List<com.order.generated.stubs.ProductDetails> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .order.ProductDetails products = 2;</code>
   */
  public java.util.List<? extends com.order.generated.stubs.ProductDetailsOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .order.ProductDetails products = 2;</code>
   */
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .order.ProductDetails products = 2;</code>
   */
  public com.order.generated.stubs.ProductDetails getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .order.ProductDetails products = 2;</code>
   */
  public com.order.generated.stubs.ProductDetailsOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(2, products_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, products_.get(i));
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
    if (!(obj instanceof com.order.generated.stubs.UserPurchaseHistory)) {
      return super.equals(obj);
    }
    com.order.generated.stubs.UserPurchaseHistory other = (com.order.generated.stubs.UserPurchaseHistory) obj;

    boolean result = true;
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
    }
    result = result && getProductsList()
        .equals(other.getProductsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.order.generated.stubs.UserPurchaseHistory parseFrom(
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
  public static Builder newBuilder(com.order.generated.stubs.UserPurchaseHistory prototype) {
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
   * Protobuf type {@code order.UserPurchaseHistory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:order.UserPurchaseHistory)
      com.order.generated.stubs.UserPurchaseHistoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.order.generated.stubs.Order.internal_static_order_UserPurchaseHistory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.order.generated.stubs.Order.internal_static_order_UserPurchaseHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.order.generated.stubs.UserPurchaseHistory.class, com.order.generated.stubs.UserPurchaseHistory.Builder.class);
    }

    // Construct using com.order.generated.stubs.UserPurchaseHistory.newBuilder()
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
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.order.generated.stubs.Order.internal_static_order_UserPurchaseHistory_descriptor;
    }

    @java.lang.Override
    public com.order.generated.stubs.UserPurchaseHistory getDefaultInstanceForType() {
      return com.order.generated.stubs.UserPurchaseHistory.getDefaultInstance();
    }

    @java.lang.Override
    public com.order.generated.stubs.UserPurchaseHistory build() {
      com.order.generated.stubs.UserPurchaseHistory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.order.generated.stubs.UserPurchaseHistory buildPartial() {
      com.order.generated.stubs.UserPurchaseHistory result = new com.order.generated.stubs.UserPurchaseHistory(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.order.generated.stubs.UserPurchaseHistory) {
        return mergeFrom((com.order.generated.stubs.UserPurchaseHistory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.order.generated.stubs.UserPurchaseHistory other) {
      if (other == com.order.generated.stubs.UserPurchaseHistory.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000002);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
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
      com.order.generated.stubs.UserPurchaseHistory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.order.generated.stubs.UserPurchaseHistory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.order.generated.stubs.UserDetails user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.order.generated.stubs.UserDetails, com.order.generated.stubs.UserDetails.Builder, com.order.generated.stubs.UserDetailsOrBuilder> userBuilder_;
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public com.order.generated.stubs.UserDetails getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.order.generated.stubs.UserDetails.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public Builder setUser(com.order.generated.stubs.UserDetails value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public Builder setUser(
        com.order.generated.stubs.UserDetails.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public Builder mergeUser(com.order.generated.stubs.UserDetails value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.order.generated.stubs.UserDetails.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public com.order.generated.stubs.UserDetails.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    public com.order.generated.stubs.UserDetailsOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.order.generated.stubs.UserDetails.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.order.UserDetails user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.order.generated.stubs.UserDetails, com.order.generated.stubs.UserDetails.Builder, com.order.generated.stubs.UserDetailsOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.order.generated.stubs.UserDetails, com.order.generated.stubs.UserDetails.Builder, com.order.generated.stubs.UserDetailsOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.util.List<com.order.generated.stubs.ProductDetails> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        products_ = new java.util.ArrayList<com.order.generated.stubs.ProductDetails>(products_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.order.generated.stubs.ProductDetails, com.order.generated.stubs.ProductDetails.Builder, com.order.generated.stubs.ProductDetailsOrBuilder> productsBuilder_;

    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public java.util.List<com.order.generated.stubs.ProductDetails> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public com.order.generated.stubs.ProductDetails getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder setProducts(
        int index, com.order.generated.stubs.ProductDetails value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder setProducts(
        int index, com.order.generated.stubs.ProductDetails.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder addProducts(com.order.generated.stubs.ProductDetails value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder addProducts(
        int index, com.order.generated.stubs.ProductDetails value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder addProducts(
        com.order.generated.stubs.ProductDetails.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder addProducts(
        int index, com.order.generated.stubs.ProductDetails.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.order.generated.stubs.ProductDetails> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public com.order.generated.stubs.ProductDetails.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public com.order.generated.stubs.ProductDetailsOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public java.util.List<? extends com.order.generated.stubs.ProductDetailsOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public com.order.generated.stubs.ProductDetails.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.order.generated.stubs.ProductDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public com.order.generated.stubs.ProductDetails.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.order.generated.stubs.ProductDetails.getDefaultInstance());
    }
    /**
     * <code>repeated .order.ProductDetails products = 2;</code>
     */
    public java.util.List<com.order.generated.stubs.ProductDetails.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.order.generated.stubs.ProductDetails, com.order.generated.stubs.ProductDetails.Builder, com.order.generated.stubs.ProductDetailsOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.order.generated.stubs.ProductDetails, com.order.generated.stubs.ProductDetails.Builder, com.order.generated.stubs.ProductDetailsOrBuilder>(
                products_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:order.UserPurchaseHistory)
  }

  // @@protoc_insertion_point(class_scope:order.UserPurchaseHistory)
  private static final com.order.generated.stubs.UserPurchaseHistory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.order.generated.stubs.UserPurchaseHistory();
  }

  public static com.order.generated.stubs.UserPurchaseHistory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserPurchaseHistory>
      PARSER = new com.google.protobuf.AbstractParser<UserPurchaseHistory>() {
    @java.lang.Override
    public UserPurchaseHistory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserPurchaseHistory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserPurchaseHistory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserPurchaseHistory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.order.generated.stubs.UserPurchaseHistory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

