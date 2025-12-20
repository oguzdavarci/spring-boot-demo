package com.example

import com.example.sample.Sample
import com.example.sample.SampleRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class SampleDataGenerator(private val repository: SampleRepository) {

    @PostConstruct
    fun generate() {
        (0..10).forEach {
            repository.save(
                Sample(name = "name #$it", age = Random.nextInt(0, 99)))
                .also {
                println("saved: $it")
            }
        }

       println("db item count: ${count()}")
    }

    fun count() = repository.count()
}