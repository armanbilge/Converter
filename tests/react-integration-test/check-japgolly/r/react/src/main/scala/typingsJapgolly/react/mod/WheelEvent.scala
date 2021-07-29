package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelEvent[T]
  extends StObject
     with MouseEvent[T, NativeWheelEvent] {
  
  var deltaMode: Double
  
  var deltaX: Double
  
  var deltaY: Double
  
  var deltaZ: Double
}
object WheelEvent {
  
  inline def apply[F[_]: Sync, T](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeWheelEvent,
    pageX: Double,
    pageY: Double,
    persist: F[Unit],
    preventDefault: F[Unit],
    relatedTarget: EventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: F[Unit],
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): WheelEvent[T] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = implicitly[Sync[F]].toJsFn(isDefaultPrevented), isPropagationStopped = implicitly[Sync[F]].toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = implicitly[Sync[F]].toJsFn(persist), preventDefault = implicitly[Sync[F]].toJsFn(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = implicitly[Sync[F]].toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelEvent[T]]
  }
  
  extension [Self <: WheelEvent[?], T](x: Self & WheelEvent[T]) {
    
    inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
  }
}
