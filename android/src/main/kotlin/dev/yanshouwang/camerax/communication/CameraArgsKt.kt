//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: communication.proto

package dev.yanshouwang.camerax.communication;

@kotlin.jvm.JvmSynthetic
inline fun cameraArgs(block: dev.yanshouwang.camerax.communication.CameraArgsKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.CameraArgs =
  dev.yanshouwang.camerax.communication.CameraArgsKt.Dsl._create(dev.yanshouwang.camerax.communication.Communication.CameraArgs.newBuilder()).apply { block() }._build()
object CameraArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: dev.yanshouwang.camerax.communication.Communication.CameraArgs.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.communication.Communication.CameraArgs.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.communication.Communication.CameraArgs = _builder.build()

    /**
     * <code>.communication.CameraSize size = 3;</code>
     */
    var size: dev.yanshouwang.camerax.communication.Communication.CameraSize
      @JvmName("getSize")
      get() = _builder.getSize()
      @JvmName("setSize")
      set(value) {
        _builder.setSize(value)
      }
    /**
     * <code>.communication.CameraSize size = 3;</code>
     */
    fun clearSize() {
      _builder.clearSize()
    }
    /**
     * <code>.communication.CameraSize size = 3;</code>
     * @return Whether the size field is set.
     */
    fun hasSize(): kotlin.Boolean {
      return _builder.hasSize()
    }

    /**
     * <code>bool has_torch = 4;</code>
     */
    var hasTorch: kotlin.Boolean
      @JvmName("getHasTorch")
      get() = _builder.getHasTorch()
      @JvmName("setHasTorch")
      set(value) {
        _builder.setHasTorch(value)
      }
    /**
     * <code>bool has_torch = 4;</code>
     */
    fun clearHasTorch() {
      _builder.clearHasTorch()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun dev.yanshouwang.camerax.communication.Communication.CameraArgs.copy(block: dev.yanshouwang.camerax.communication.CameraArgsKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.CameraArgs =
  dev.yanshouwang.camerax.communication.CameraArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
