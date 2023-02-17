package ru.rsreu.rodin.petprojectkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( "/api/hello")
class HelloWorldController {

    @GetMapping
    fun greetings() = "Hello, this is a REST endpoint"
}