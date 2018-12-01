package observer

import scala.collection.immutable.Vector

class Button(_observers: Vector[Observer]) extends Clickable {

  var count = 0
  val observers = _observers

  def click(): Unit = {
    this.count += 1
    this.notifyObservers
  }

  def status(): Int = {
    this.count
  }

}
