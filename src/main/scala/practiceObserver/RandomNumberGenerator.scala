package practiceObserver

import scala.math

class RandomNumberGenerator extends NumberGenerator {

  var number = 0

  def execute(): Unit = {
    for (num <- 0 to 20) {
      this.number = (math.random * 10).toInt
      this.notifyObservers
    }
  }

  def getNumber(): Int = {
    this.number
  }

}
