//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax.messages;

@kotlin.jvm.JvmName("-initializegetQuarterTurnsReplyArguments")
public inline fun getQuarterTurnsReplyArguments(block: dev.yanshouwang.camerax.messages.GetQuarterTurnsReplyArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments =
  dev.yanshouwang.camerax.messages.GetQuarterTurnsReplyArgumentsKt.Dsl._create(dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments.newBuilder()).apply { block() }._build()
public object GetQuarterTurnsReplyArgumentsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments = _builder.build()

    /**
     * <code>int32 quarter_turns = 1;</code>
     */
    public var quarterTurns: kotlin.Int
      @JvmName("getQuarterTurns")
      get() = _builder.getQuarterTurns()
      @JvmName("setQuarterTurns")
      set(value) {
        _builder.setQuarterTurns(value)
      }
    /**
     * <code>int32 quarter_turns = 1;</code>
     */
    public fun clearQuarterTurns() {
      _builder.clearQuarterTurns()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments.copy(block: dev.yanshouwang.camerax.messages.GetQuarterTurnsReplyArgumentsKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.GetQuarterTurnsReplyArguments =
  dev.yanshouwang.camerax.messages.GetQuarterTurnsReplyArgumentsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

