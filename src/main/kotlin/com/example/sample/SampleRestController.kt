package com.example.sample

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sample")
class SampleRestController(val service: SampleService, private val repository: SampleRepository) {

    @GetMapping("/hello")
    fun hello(@RequestParam(required = false) name: String = "") = "Hello $name!"

    @GetMapping("/greeting/{userName}")
    fun greeting(@PathVariable("userName") name: String) = service.greeting(name = name)

    @GetMapping("/scrape")
    fun scrape(@RequestParam url: String) = service.scrape(url)

    @GetMapping("/{sampleId}")
    fun get(@PathVariable("sampleId") sample: Sample) = sample

    @PostMapping
    fun save(@RequestBody sample: Sample): Sample? = repository.save(sample)

    @DeleteMapping("/{sampleId}")
    fun delete(@PathVariable("sampleId") sample: Sample) = repository.deleteById(sample.id!!)

    @GetMapping("/samples")
    fun getAll(): List<Sample> = repository.findAll()
}