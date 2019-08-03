package com.learn.springmvcdemo.services

import com.learn.springmvcdemo.entities.Site
import groovy.util.logging.Slf4j
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

import static org.junit.jupiter.api.Assertions.*

@SpringBootTest
@ExtendWith(SpringExtension)
@Slf4j
class GeocoderServiceTest {

    @Autowired
    private GeocoderService service

    @Test
    void getLatLngForGoogleHeadQuarters() {
        String address = "1600 Amphitheatre Pkwy, Mountain View, CA"
        Site site = service.getLatLng(address)

        log.info("Google returned: ${site.toString()}")

        assertEquals(37.42, site.latitude, 0.01)
        assertEquals(-122.08, site.longitude, 0.01)
        assertTrue(site.name.contains(address), "address is not the same")
    }

    @Test
    void getLatLngWithoutStreetAddress() {
        String address = "Boston, MA"
        Site response = service.getLatLng(address)

        log.info("Google returned: ${response.toString()}")

        assertEquals(42.36, response.latitude, 0.01)
        assertEquals(-71.06, response.longitude, 0.2)
        assertTrue(response.name.contains(address),"address is not the same")
    }

}
