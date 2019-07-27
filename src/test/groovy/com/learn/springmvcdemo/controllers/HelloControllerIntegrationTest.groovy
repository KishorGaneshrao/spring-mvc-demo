package com.learn.springmvcdemo.controllers

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import static org.hamcrest.Matchers.is
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@RunWith(SpringRunner)
@WebMvcTest
class HelloControllerIntegrationTest {

    @Autowired
    MockMvc mvc

    @Test
    void sayHelloWithoutNameTest() throws Exception{
        mvc.perform(get("/hello").accept(MediaType.TEXT_PLAIN))
            .andExpect(status().isOk())
            .andExpect(view().name("Hello"))
            .andExpect(model().attribute("user", is("World")))
    }

    @Test
    void sayHelloWithNameTest() throws Exception{
        mvc.perform(get("/hello").param("name", "Tester").accept(MediaType.TEXT_PLAIN))
            .andExpect(status().isOk())
            .andExpect(view().name("Hello"))
            .andExpect(model().attribute("user", is("Tester")))
    }
}
