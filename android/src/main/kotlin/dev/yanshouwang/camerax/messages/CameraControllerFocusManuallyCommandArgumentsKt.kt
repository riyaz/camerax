//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax.messages;

@kotlin.jvm.JvmName("-initializecameraControllerFocusManuallyCommandArguments")
public inline fun cameraControllerFocusManuallyCommandArguments(block: dev.yanshouwang.camerax.messages.CameraControllerFocusManuallyCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerFocusManuallyCommandArgumentsKt.Dsl._create(dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments.newBuilder()).apply { block() }._build()
public object CameraControllerFocusManuallyCommandArgumentsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments = _builder.build()

    /**
     * <code>string id = 1;</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>double width = 2;</code>
     */
    public var width: kotlin.Double
      @JvmName("getWidth")
      get() = _builder.getWidth()
      @JvmName("setWidth")
      set(value) {
        _builder.setWidth(value)
      }
    /**
     * <code>double width = 2;</code>
     */
    public fun clearWidth() {
      _builder.clearWidth()
    }

    /**
     * <code>double height = 3;</code>
     */
    public var height: kotlin.Double
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>double height = 3;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>double x = 4;</code>
     */
    public var x: kotlin.Double
      @JvmName("getX")
      get() = _builder.getX()
      @JvmName("setX")
      set(value) {
        _builder.setX(value)
      }
    /**
     * <code>double x = 4;</code>
     */
    public fun clearX() {
      _builder.clearX()
    }

    /**
     * <code>double y = 5;</code>
     */
    public var y: kotlin.Double
      @JvmName("getY")
      get() = _builder.getY()
      @JvmName("setY")
      set(value) {
        _builder.setY(value)
      }
    /**
     * <code>double y = 5;</code>
     */
    public fun clearY() {
      _builder.clearY()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments.copy(block: dev.yanshouwang.camerax.messages.CameraControllerFocusManuallyCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerFocusManuallyCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerFocusManuallyCommandArgumentsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

