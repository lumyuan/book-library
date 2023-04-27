package com.example.booklibrary.module.test.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @RequestMapping("/test")
    fun test(): String = "Hello World! -- SpringBoot 3"

}