package interpreter

// 処理結果を表すクラス
class Expression(val operator: Operator) extends Operand {

  def operandString(): String = {
    this.operator.execute.operandString
  }

}
