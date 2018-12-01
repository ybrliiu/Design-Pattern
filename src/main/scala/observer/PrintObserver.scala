package observer

class PrintObserver extends Observer {

  def update(clickable: Clickable) = {
    println(s"status : ${ clickable.status }")
  }

}
