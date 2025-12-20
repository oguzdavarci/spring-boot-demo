package com.example.sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleRestController(val service: SampleService) {

    @GetMapping("/hello")
    fun hello(@RequestParam(required = false) name: String = "") = "Hello $name!"

    @GetMapping("/greeting/{userName}")
    fun greeting(@PathVariable("userName") name: String) = service.greeting(name = "")
}