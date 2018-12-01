package iterator

class StudentListIterator(val studentList: StudentList) extends Iterator {

  var index = 0

  def hasNext(): Boolean = {
    this.studentList.getLastNum > this.index
  }

  def next(): Student = {
    val student = this.studentList.getStudentAt(this.index)
    this.index += 1
    student
  }

}

