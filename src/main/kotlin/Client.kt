
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.InputType
import kotlinx.html.button
import kotlinx.html.dom.append
import kotlinx.html.id
import kotlinx.html.input
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.Node
import org.w3c.dom.events.Event

fun main() {
  window.onload = { document.body?.sayHello() }
}

fun Node.sayHello() {
  append {
      div {
          input {
            id = "cel"
            placeholder = "enter cel"
            type = InputType.number
            val x = ""
            value = x
          }
      }
      div {
          input {
            id = "far"
            placeholder = "enter far"
            type = InputType.number
            val y = ""
            value = y
          }
      }
      div {
        button {
          +"cel To Far"
          onClickFunction = ::celToFar
        }
        button {
          +"far To Cel"
          onClickFunction = ::farToCel
        }
        button {
          +"clear"
          onClickFunction = ::clearFun
        }
      }
  }
}

class degree(){
  val cel = document.getElementById("cel") as HTMLInputElement
  val far = document.getElementById("far") as HTMLInputElement
}

  fun celToFar(e: Event): Unit {
    val a = degree()
    val cel = a.cel
    val far = a.far
    far.value = ((9.0 / 5.0 * cel.value.toDouble()) + 32).toString()
  }

  fun farToCel(e: Event): Unit {
    val a = degree()
    val cel = a.cel
    val far = a.far
    cel.value = (5.0 / 9.0 * (far.value.toDouble() - 32)).toString()
  }

  fun clearFun(e: Event):Unit{
    val a = degree()
    val cel = a.cel
    val far = a.far
    cel.value = ""
    far.value = ""
  }




