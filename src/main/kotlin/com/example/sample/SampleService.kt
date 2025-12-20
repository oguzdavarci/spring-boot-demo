package com.example.sample

import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient
import org.springframework.web.client.body

@Service
class SampleService (val restClient: RestClient) {

    fun greeting(name: String) = "Hello $name!"

    fun scrape(url: String) = "result: ${restClient.get().uri(url).retrieve().body<String>()}"
}