package com.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient

@Configuration
class DefaultBeanConfig {

//    @Bean
//    fun sampleService(restClient: RestClient) = SampleService(restClient)

    @Bean
    fun restClient() = RestClient.create()
}