package com.example.student.usecases.interactors

import com.example.student.entities.Student
import com.example.student.persistence.StudentRepositoryProxy
import com.example.student.usecases.ports.input.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl @Autowired()(studentRepository: StudentRepositoryProxy) extends StudentService {

  override def findByStudentId(studentId: Int): Option[Student] = {
    //Some service logic goes here
    studentRepository findById studentId
  }

  override def create(student: Student): Student = {
    //Some service logic goes here
    studentRepository save student
  }
}
