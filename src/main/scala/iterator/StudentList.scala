package iterator

import scala.collection.mutable.ArrayBuffer

class StudentList(val students: ArrayBuffer[Student]) extends Aggregate {

  def add(student: Student): Unit = {
    this.students += student
  }

  def getStudentAt(index: Int): Student = {
    this.students(index)
  }

  def getLastNum(): Int = {
    this.students.size
  }

  def iterator(): StudentListIterator = {
    new StudentListIterator(this)
  }

}
