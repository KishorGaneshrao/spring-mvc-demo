package com.learn.springmvcdemo.services

import com.learn.springmvcdemo.entities.Site
import com.learn.springmvcdemo.json.Response
import groovy.util.logging.Slf4j
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

import java.nio.charset.StandardCharsets

@Service
@Slf4j
class GeocoderService {

    private static final String BASE = "https://maps.googleapis.com/maps/api/geocode/json"
    private static final String KEY = "AIzaSyDw_d6dfxDEI7MAvqfGXEIsEMwjC1PWRno"

    private RestTemplate restTemplate

    GeocoderService(RestTemplateBuilder builder) {
        restTemplate = builder.build()
    }

    Site getLatLng(String... address) {
        String joinedAddress = String.join(",", address)
        String encodedAddress = URLEncoder.encode(joinedAddress, StandardCharsets.UTF_8 as String)

        Response response = restTemplate.getForObject(
                String.format("%s?address=%s&key=%s", BASE, encodedAddress, KEY), Response)

        return new Site(response.getFormattedAddress(),
                        response.getLocation().getLat(),
                        response.getLocation().getLng())
    }
}
