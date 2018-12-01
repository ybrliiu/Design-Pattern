package observer

import scala.collection.immutable.Vector

abstract class Clickable {

  val observers: Vector[Observer]

  def notifyObservers(): Unit = {
    for (observer <- this.observers) {
      observer.update(this)
    }
  }

  def click(): Unit

  def status(): Int

}
