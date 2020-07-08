package com.example.student.persistence

import com.example.student.persistence.converters._
import com.example.student.entities.Student
import com.example.student.usecases.ports.output.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Instance of this class is used to convert between Spring repository data types and Scala data types. This class
 * could be replaced by one extending a Repository trait and with org.springframework.stereotype.Repository
 * annotation
 */

@Component
class StudentRepositoryProxy @Autowired()(studentRepository: StudentRepository) {
  def findById(id: Int): Option[Student] = {
    val result = studentRepository findById id
    if (result isPresent) {
      Some(result get)
    } else {
      None
    }
  }

  def save(student: Student): Student = {
    studentRepository save[StudentPersistence] student
  }

}
