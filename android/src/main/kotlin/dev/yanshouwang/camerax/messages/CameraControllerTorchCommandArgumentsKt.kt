//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax.messages;

@kotlin.jvm.JvmName("-initializecameraControllerTorchCommandArguments")
public inline fun cameraControllerTorchCommandArguments(block: dev.yanshouwang.camerax.messages.CameraControllerTorchCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerTorchCommandArgumentsKt.Dsl._create(dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments.newBuilder()).apply { block() }._build()
public object CameraControllerTorchCommandArgumentsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments = _builder.build()

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
     * <code>bool state = 2;</code>
     */
    public var state: kotlin.Boolean
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <code>bool state = 2;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments.copy(block: dev.yanshouwang.camerax.messages.CameraControllerTorchCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerTorchCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerTorchCommandArgumentsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

