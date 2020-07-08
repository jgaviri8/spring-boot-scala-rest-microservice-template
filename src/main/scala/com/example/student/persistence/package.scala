package com.example.student.persistence

import com.example.student.entities.Student

package object converters {

  implicit def toStudent(studentPersistence: StudentPersistence): Student = {
    Student(studentPersistence.id, studentPersistence.firstName, studentPersistence.lastName)
  }

  implicit def toStudentPersistence(student: Student): StudentPersistence = {
    StudentPersistence(student.studentId, student.firstName, student.lastName)
  }

}
