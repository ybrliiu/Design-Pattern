package interpreter

// 足し算処理のクラス
class Plus(
  private val left: Operand,
  private val right: Operand
) extends Operator {

  def execute(): Operand = {
    new Ingredient(s"${ this.left.operandString } + ${ this.right.operandString }")
  }

}
