package observer

trait Observer {

  def update(clickable: Clickable): Unit

}
