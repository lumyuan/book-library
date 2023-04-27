package com.example.booklibrary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BookLibraryApplication

fun main(args: Array<String>) {
    runApplication<BookLibraryApplication>(*args)
}
