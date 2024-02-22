package com.octobit8.springkotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinAppApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinAppApplication>(*args)
}
