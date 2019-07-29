package com.learn.springmvcdemo.controllers

import com.learn.springmvcdemo.entities.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {

    @GetMapping("/rest")
    Greeting greet(@RequestParam (required = false, defaultValue = "World") String name){
        return new Greeting(String.format("Hello, %s!", name))
    }

}
