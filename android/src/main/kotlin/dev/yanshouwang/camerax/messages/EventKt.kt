//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: messages.proto

package dev.yanshouwang.camerax.messages;

@kotlin.jvm.JvmName("-initializeevent")
public inline fun event(block: dev.yanshouwang.camerax.messages.EventKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.Event =
  dev.yanshouwang.camerax.messages.EventKt.Dsl._create(dev.yanshouwang.camerax.messages.Messages.Event.newBuilder()).apply { block() }._build()
public object EventKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: dev.yanshouwang.camerax.messages.Messages.Event.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: dev.yanshouwang.camerax.messages.Messages.Event.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): dev.yanshouwang.camerax.messages.Messages.Event = _builder.build()

    /**
     * <code>.messages.EventCategory category = 1;</code>
     */
    public var category: dev.yanshouwang.camerax.messages.Messages.EventCategory
      @JvmName("getCategory")
      get() = _builder.getCategory()
      @JvmName("setCategory")
      set(value) {
        _builder.setCategory(value)
      }
    /**
     * <code>.messages.EventCategory category = 1;</code>
     */
    public fun clearCategory() {
      _builder.clearCategory()
    }

    /**
     * <code>.messages.QuarterTurnsChangedEventArguments quarter_turns_changed_arguments = 2;</code>
     */
    public var quarterTurnsChangedArguments: dev.yanshouwang.camerax.messages.Messages.QuarterTurnsChangedEventArguments
      @JvmName("getQuarterTurnsChangedArguments")
      get() = _builder.getQuarterTurnsChangedArguments()
      @JvmName("setQuarterTurnsChangedArguments")
      set(value) {
        _builder.setQuarterTurnsChangedArguments(value)
      }
    /**
     * <code>.messages.QuarterTurnsChangedEventArguments quarter_turns_changed_arguments = 2;</code>
     */
    public fun clearQuarterTurnsChangedArguments() {
      _builder.clearQuarterTurnsChangedArguments()
    }
    /**
     * <code>.messages.QuarterTurnsChangedEventArguments quarter_turns_changed_arguments = 2;</code>
     * @return Whether the quarterTurnsChangedArguments field is set.
     */
    public fun hasQuarterTurnsChangedArguments(): kotlin.Boolean {
      return _builder.hasQuarterTurnsChangedArguments()
    }

    /**
     * <code>.messages.CameraControllerImageProxiedEventArguments camera_controller_image_proxied_arguments = 3;</code>
     */
    public var cameraControllerImageProxiedArguments: dev.yanshouwang.camerax.messages.Messages.CameraControllerImageProxiedEventArguments
      @JvmName("getCameraControllerImageProxiedArguments")
      get() = _builder.getCameraControllerImageProxiedArguments()
      @JvmName("setCameraControllerImageProxiedArguments")
      set(value) {
        _builder.setCameraControllerImageProxiedArguments(value)
      }
    /**
     * <code>.messages.CameraControllerImageProxiedEventArguments camera_controller_image_proxied_arguments = 3;</code>
     */
    public fun clearCameraControllerImageProxiedArguments() {
      _builder.clearCameraControllerImageProxiedArguments()
    }
    /**
     * <code>.messages.CameraControllerImageProxiedEventArguments camera_controller_image_proxied_arguments = 3;</code>
     * @return Whether the cameraControllerImageProxiedArguments field is set.
     */
    public fun hasCameraControllerImageProxiedArguments(): kotlin.Boolean {
      return _builder.hasCameraControllerImageProxiedArguments()
    }
    public val argumentsCase: dev.yanshouwang.camerax.messages.Messages.Event.ArgumentsCase
      @JvmName("getArgumentsCase")
      get() = _builder.getArgumentsCase()

    public fun clearArguments() {
      _builder.clearArguments()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun dev.yanshouwang.camerax.messages.Messages.Event.copy(block: dev.yanshouwang.camerax.messages.EventKt.Dsl.() -> kotlin.Unit): dev.yanshouwang.camerax.messages.Messages.Event =
  dev.yanshouwang.camerax.messages.EventKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val dev.yanshouwang.camerax.messages.Messages.EventOrBuilder.quarterTurnsChangedArgumentsOrNull: dev.yanshouwang.camerax.messages.Messages.QuarterTurnsChangedEventArguments?
  get() = if (hasQuarterTurnsChangedArguments()) getQuarterTurnsChangedArguments() else null

val dev.yanshouwang.camerax.messages.Messages.EventOrBuilder.cameraControllerImageProxiedArgumentsOrNull: dev.yanshouwang.camerax.messages.Messages.CameraControllerImageProxiedEventArguments?
  get() = if (hasCameraControllerImageProxiedArguments()) getCameraControllerImageProxiedArguments() else null

