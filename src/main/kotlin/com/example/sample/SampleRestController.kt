package com.example.sample

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sample")
class SampleRestController(val service: SampleService) {

    @GetMapping("/hello")
    fun hello(@RequestParam(required = false) name: String = "") = service.hello(name)

    @GetMapping("/greeting/{userName}")
    fun greeting(@PathVariable("userName") name: String) = service.greeting(name = name)

    @GetMapping("/scrape")
    fun scrape(@RequestParam url: String) = service.scrape(url)

    @PostMapping
    fun save(@RequestBody sample: Sample): Sample? = service.save(sample)

    @GetMapping("/{sampleId}")
    fun get(@PathVariable("sampleId") sample: Sample) = service.get(sample)

    @DeleteMapping("/{sampleId}")
    fun delete(@PathVariable("sampleId") sample: Sample) = service.delete(sample)

    @GetMapping("/samples")
    fun getAll(): List<Sample> = service.getAll()
}