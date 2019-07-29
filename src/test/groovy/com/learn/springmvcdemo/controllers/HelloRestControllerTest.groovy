package com.learn.springmvcdemo.controllers

import com.learn.springmvcdemo.entities.Greeting
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner

import static org.junit.Assert.assertEquals

@RunWith(SpringRunner)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloRestControllerTest {

    @Autowired
    private TestRestTemplate template

    @Test
    void greetingWithoutName() {
        ResponseEntity<Greeting> entity = template.getForEntity("/rest", Greeting)
        assertEquals(HttpStatus.OK, entity.statusCode)
        assertEquals(MediaType.APPLICATION_JSON_UTF8, entity.headers.getContentType())
        Greeting response = entity.body
        assertEquals("Hello, World!", response.message)
    }

    @Test
    void greetingWithName() {
        Greeting response = template.getForObject("/rest?name=Test3", Greeting)
        assertEquals("Hello, Test3!", response.getMessage())
    }
}
