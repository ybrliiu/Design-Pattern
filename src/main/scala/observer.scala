import observer._
import scala.collection.immutable.Vector

object ObserverApp extends App {

  println("== ButtonをクリックするたびにObserversに通知が行きます")

  val printObserver = new PrintObserver
  val button = new Button( Vector(printObserver) )
  for (i <- 0 to 3) {
    button.click
  }

}
