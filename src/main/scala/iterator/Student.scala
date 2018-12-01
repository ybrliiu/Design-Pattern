package iterator

class StudentName(val name: String) {

  override def toString: String = {
    this.name
  }

}

// sealed class による列挙型の実現
sealed trait StudentSex
case object Boy  extends StudentSex
case object Girl extends StudentSex

class Student(val name: StudentName, val sex: StudentSex)
