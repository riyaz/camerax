//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax.messages;

@kotlin.jvm.JvmName("-initializecameraControllerUnbindCommandArguments")
public inline fun cameraControllerUnbindCommandArguments(block: dev.yanshouwang.camerax.messages.CameraControllerUnbindCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerUnbindCommandArgumentsKt.Dsl._create(dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments.newBuilder()).apply { block() }._build()
public object CameraControllerUnbindCommandArgumentsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments = _builder.build()

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
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments.copy(block: dev.yanshouwang.camerax.messages.CameraControllerUnbindCommandArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.CameraControllerUnbindCommandArguments =
  dev.yanshouwang.camerax.messages.CameraControllerUnbindCommandArgumentsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

