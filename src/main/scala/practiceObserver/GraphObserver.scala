package practiceObserver

class GraphObserver extends Observer {

  def update(numberGenerator: NumberGenerator): Unit = {
    val graph = "*" * numberGenerator.getNumber
    println(s"GraphObserver : $graph")
    Thread.sleep(100)
  }

}
