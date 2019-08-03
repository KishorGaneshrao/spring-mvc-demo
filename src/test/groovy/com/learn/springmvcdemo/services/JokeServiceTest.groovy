package com.learn.springmvcdemo.services

import groovy.util.logging.Slf4j
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

import static org.junit.jupiter.api.Assertions.assertTrue

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class JokeServiceTest {
    @Autowired
    private JokeService service

    @Test
    void getJokeTest() {
        String joke = service.getJoke("awesome", "tester")
        log.info("from test: ${joke}")
        assertTrue(joke.contains("awesome") || joke.contains("tester"))
    }
}