package com.learn.springmvcdemo.controllers

import org.junit.Test
import org.springframework.ui.Model
import org.springframework.validation.support.BindingAwareModelMap

import static junit.framework.Assert.assertEquals

class HelloControllerUnitTest {

    @Test
    void sayHelloTest() {
        HelloController controller = new HelloController()
        Model model = new BindingAwareModelMap()
        String result = controller.sayHello("Tester",model)

        assertEquals("Hello", result)
        assertEquals("Tester", model.asMap().get("user"))
    }
}
