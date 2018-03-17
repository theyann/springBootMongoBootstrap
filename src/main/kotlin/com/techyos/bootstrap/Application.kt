package com.techyos.bootstrap

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class Application : SpringBootServletInitializer()

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}