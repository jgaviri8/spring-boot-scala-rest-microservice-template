package com.example.student.persistence

import scala.annotation.meta.field
import javax.persistence.{Column, Entity, Id, Table}

@Table(name = "students")
@Entity()
case class StudentPersistence (
                               @(Id @field) @Column(name = "id") id: Integer,
                               @Column(name = "first_name") firstName: java.lang.String,
                               @Column (name = "last_name") lastName: java.lang.String
                             ) extends java.io.Serializable {
  def this() = {this(null, null, null)}
}


