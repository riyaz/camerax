//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: communication.proto

package dev.yanshouwang.camerax.communication;

@kotlin.jvm.JvmSynthetic
inline fun bindArgs(block: dev.yanshouwang.camerax.communication.BindArgsKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.BindArgs =
  dev.yanshouwang.camerax.communication.BindArgsKt.Dsl._create(dev.yanshouwang.camerax.communication.Communication.BindArgs.newBuilder()).apply { block() }._build()
object BindArgsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: dev.yanshouwang.camerax.communication.Communication.BindArgs.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.communication.Communication.BindArgs.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.communication.Communication.BindArgs = _builder.build()

    /**
     * <code>.communication.CameraSelector selector = 2;</code>
     */
    var selector: dev.yanshouwang.camerax.communication.Communication.CameraSelector
      @JvmName("getSelector")
      get() = _builder.getSelector()
      @JvmName("setSelector")
      set(value) {
        _builder.setSelector(value)
      }
    /**
     * <code>.communication.CameraSelector selector = 2;</code>
     */
    fun clearSelector() {
      _builder.clearSelector()
    }
    /**
     * <code>.communication.CameraSelector selector = 2;</code>
     * @return Whether the selector field is set.
     */
    fun hasSelector(): kotlin.Boolean {
      return _builder.hasSelector()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun dev.yanshouwang.camerax.communication.Communication.BindArgs.copy(block: dev.yanshouwang.camerax.communication.BindArgsKt.Dsl.() -> Unit): dev.yanshouwang.camerax.communication.Communication.BindArgs =
  dev.yanshouwang.camerax.communication.BindArgsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
