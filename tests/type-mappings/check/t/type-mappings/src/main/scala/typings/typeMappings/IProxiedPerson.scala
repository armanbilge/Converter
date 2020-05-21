package typings.typeMappings

import typings.typeMappings.anon.Get
import typings.typeMappings.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent type-mappings.Proxify<type-mappings.Person> */
@js.native
trait IProxiedPerson extends js.Object {
  var age: Get = js.native
  var name: Set = js.native
}

object IProxiedPerson {
  @scala.inline
  def apply(age: Get, name: Set): IProxiedPerson = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxiedPerson]
  }
  @scala.inline
  implicit class IProxiedPersonOps[Self <: IProxiedPerson] (val x: Self) extends AnyVal {
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
    def setAge(value: Get): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Set): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

