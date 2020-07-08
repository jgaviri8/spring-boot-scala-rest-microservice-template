package com.example.student

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class StudentApplication

object StudentApplication extends App {
  SpringApplication.run(classOf[StudentApplication], args:_*)
}
