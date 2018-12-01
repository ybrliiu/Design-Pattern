package iterator

import scala.collection.mutable.ArrayBuffer

class Teacher {

  lazy val studentList: StudentList = new StudentList(
    ArrayBuffer(
      new Student(
        new StudentName("岡崎由真"),
        Girl
      ),
      new Student(
        new StudentName("水科蛍"),
        Girl
      )
    )
  )

  def callStudents(): Unit = {
    val iter = studentList.iterator
    while ( iter.hasNext ) {
      val student = iter.next
      println( student.name )
    }
  }

}
