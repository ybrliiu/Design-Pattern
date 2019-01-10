import interpreter._

object InterperterApp extends App {

  val expression = new Expression(
    new Plus(
      new Expression(
        new Wait(
          3,
          new Expression(
            new Plus(
              new Expression(
                new Plus(
                  new PowderSoup,
                  new Noodle
                )
              ),
              new HotWater
            )
          )
        )
      ),
      new LiquidSoup
    )
  )

  println( expression.operandString() )
}
