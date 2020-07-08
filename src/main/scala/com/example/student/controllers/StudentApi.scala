package com.example.student.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{PathVariable, RequestBody, RequestMapping, RequestMethod}

@RequestMapping(Array("/student"))
trait StudentApi {

  @RequestMapping(value = Array("/{id}"), produces = Array("application/json"), method = Array(RequestMethod.GET))
  def getStudent(@PathVariable("id") id: Integer) : ResponseEntity[StudentREST]

  @RequestMapping(produces = Array("application/json"), consumes = Array("application/json"),
    method = Array(RequestMethod.POST))
  def create(@RequestBody studentREST: StudentREST): ResponseEntity[StudentREST]
}
