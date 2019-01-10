package interpreter

// 待機処理のクラス
class Wait(
  private val minutes: Int = -1,
  private val operand: Operand
) extends Operator {

  def execute(): Operand = {
    new Ingredient(s"${ this.operand.operandString } を ${ this.minutes } 分おいたもの")
  }

}
