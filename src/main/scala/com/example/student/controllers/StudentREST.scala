package com.example.student.controllers

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.validation.annotation.Validated

@Validated
case class StudentREST(
                        @JsonProperty("id") id: Int,
                        @JsonProperty("firstName") firstName: String,
                        @JsonProperty("lastName") lastName: String
                      )
