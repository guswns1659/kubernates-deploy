package com.kubernate.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class TestController {

    @GetMapping("ping")
    fun test() : String {
        return "pong"
    }
}
