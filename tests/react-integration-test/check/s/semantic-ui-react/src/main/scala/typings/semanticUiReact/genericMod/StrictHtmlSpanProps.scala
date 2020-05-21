package typings.semanticUiReact.genericMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictHtmlSpanProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
}

object StrictHtmlSpanProps {
  @scala.inline
  def apply(): StrictHtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlSpanProps]
  }
  @scala.inline
  implicit class StrictHtmlSpanPropsOps[Self <: StrictHtmlSpanProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

