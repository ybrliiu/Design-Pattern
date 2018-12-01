package practiceObserver

class DegitObserver extends Observer {

  def update(numberGenerator: NumberGenerator): Unit = {
    println(s"DegitObserver : ${ numberGenerator.getNumber }")
    Thread.sleep(100)
  }

}
