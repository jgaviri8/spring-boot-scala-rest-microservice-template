package com.example.student.usecases.ports.output

import com.example.student.persistence.StudentPersistence
import org.springframework.data.repository.CrudRepository

trait StudentRepository extends CrudRepository[StudentPersistence, Integer] {
}
