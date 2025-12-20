package com.example.sample

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Entity
data class Sample(
    @Id @GeneratedValue(strategy = GenerationType.UUID) val id: UUID? = null,

    val name: String = "",
    val age: Int = 0,
)

@Repository
interface SampleRepository : JpaRepository<Sample, UUID>