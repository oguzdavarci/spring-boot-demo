package com.example.sample

import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient
import org.springframework.web.client.body

@Service
class SampleService(val restClient: RestClient, private val repository: SampleRepository) {

    fun hello(name: String? = "") = "Hello $name!"

    fun greeting(name: String) = "Hello $name!"

    fun scrape(url: String) = "result: ${restClient.get().uri(url).retrieve().body<String>()}"

    fun save(sample: Sample): Sample? = repository.save(sample)

    fun get(sample: Sample) = sample

    fun delete(sample: Sample) = repository.deleteById(sample.id!!)

    fun getAll(): List<Sample> = repository.findAll()
}