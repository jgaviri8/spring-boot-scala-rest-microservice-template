package com.example.student.controllers

import com.example.student.controllers.converters._
import com.example.student.usecases.ports.input.StudentService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import javax.servlet.http.HttpServletRequest
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, RequestBody}

@Controller
class StudentController @Autowired() (studentService: StudentService,
                                     objectMapper: ObjectMapper,
                                     request: HttpServletRequest) extends StudentApi {
  objectMapper.registerModule(DefaultScalaModule)

  override def getStudent(@PathVariable("id") id: Integer): ResponseEntity[StudentREST] = {
    val result = studentService findByStudentId id
    val responseHeaders = new HttpHeaders
    responseHeaders setExpires 1000
    responseHeaders.set("MyHeader", "valor x")
    result match {
      case Some(ent) => new ResponseEntity[StudentREST](ent, responseHeaders, HttpStatus.OK)
      case None => new ResponseEntity[StudentREST](responseHeaders, HttpStatus.NOT_FOUND)
    }
  }

  override def create(@RequestBody studentREST: StudentREST): ResponseEntity[StudentREST] = {
    val accept = request getHeader "Accept" //Just for request instance usage example
    val responseHeaders = new HttpHeaders
    val result = studentService create studentREST
    responseHeaders setExpires 1000
    responseHeaders.set("MyHeader", "valor x")
    new ResponseEntity[StudentREST](result, responseHeaders, HttpStatus.CREATED)
  }
}

object StudentController {
  private val log: Logger = LoggerFactory getLogger classOf[StudentController]
}