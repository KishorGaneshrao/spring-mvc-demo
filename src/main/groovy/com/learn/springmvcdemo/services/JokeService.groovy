package com.learn.springmvcdemo.services

import com.learn.springmvcdemo.template.JokeResponse
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@Slf4j
class JokeService {

    private String baseUrl = "http://api.icndb.com/jokes/random?limitTo=[nerdy]"

    private RestTemplate restTemplate

    @Autowired
    JokeService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build()
    }

    String getJoke(String firstName, String lastName) {
        String url = String.format("%s&firstName=%s&lastName=%s", baseUrl, firstName, lastName)
        JokeResponse response = restTemplate.getForObject(url, JokeResponse)
        return response !=null ? response.value.joke: ""
    }


}
