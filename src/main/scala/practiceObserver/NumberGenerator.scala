package practiceObserver

import scala.collection.mutable.ArrayBuffer

trait NumberGenerator {

  val observers = new ArrayBuffer[Observer]

  def addObserver(observers: Observer): Unit = {
    this.observers += observers
  }

  def deleteObserver(observers: Observer): Unit = {
    this.observers -= observers
  }

  def notifyObservers(): Unit = {
    for (observer <- this.observers) {
      observer.update(this)
    }
  }

  def getNumber(): Int

  def execute(): Unit

}
