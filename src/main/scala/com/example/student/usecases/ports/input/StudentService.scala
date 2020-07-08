package com.example.student.usecases.ports.input

import com.example.student.entities.Student

trait StudentService {
  def findByStudentId(studentId: Int): Option[Student]

  def create(student: Student): Student
}
