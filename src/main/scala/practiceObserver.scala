import practiceObserver._

object practiceObserverApp extends App {

  println("=== Observer pattern practice ===")
  println(" RandomNumberGenerator が数値を20回生成し, 生成する毎にObserversに変更を通知します ")

  val generator     = new RandomNumberGenerator
  val degitObserver = new DegitObserver
  val graphObserver = new GraphObserver
  generator.addObserver(degitObserver)
  generator.addObserver(graphObserver)
  generator.execute

}
