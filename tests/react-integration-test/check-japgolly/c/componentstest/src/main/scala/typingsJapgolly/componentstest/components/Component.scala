package typingsJapgolly.componentstest.components

import japgolly.scalajs.react.util.Effect.Sync
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  object A {
    
    inline def apply[F[_]](aCallback: F[Double], aMember: Double)(implicit _sync: Sync[F]): Default[js.Object] = {
      val __props = js.Dynamic.literal(aCallback = _sync.toJsFn(aCallback), aMember = aMember.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.componentstest.mod.A]))
    }
    
    @JSImport("componentstest", "Component")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.componentstest.mod.A): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object B {
    
    inline def apply(bMember: String): Builder = {
      val __props = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.componentstest.mod.B]))
    }
    
    @JSImport("componentstest", "Component")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def bCallback[F[_]](value: F[String])(implicit _sync: Sync[F]): this.type = set("bCallback", _sync.toJsFn(value))
    }
    
    def withProps(p: typingsJapgolly.componentstest.mod.B): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
