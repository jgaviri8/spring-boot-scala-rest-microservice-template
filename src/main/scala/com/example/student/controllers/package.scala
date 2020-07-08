package com.example.student.controllers

import com.example.student.entities.Student

package object converters {
  implicit def toStudentREST(student: Student): StudentREST = {
    StudentREST(student.studentId, student.firstName, student.lastName)
  }

  implicit def toStudent(studentREST: StudentREST): Student = {
    Student(studentREST.id, studentREST.firstName, studentREST.lastName)
  }
}