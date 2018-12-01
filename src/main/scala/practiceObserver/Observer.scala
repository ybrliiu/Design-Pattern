package practiceObserver

trait Observer {

  def update(generator: NumberGenerator): Unit

}
