package com.example.sample

import org.springframework.stereotype.Service

@Service
class SampleService {

    fun greeting(name: String) = "Hello $name!"
}