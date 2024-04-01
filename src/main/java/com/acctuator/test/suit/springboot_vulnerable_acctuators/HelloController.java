package com.acctuator.test.suit.springboot_vulnerable_acctuators;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

    private static final Logger LOGGER = 
    LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        LOGGER.debug("Hitting the root /");
        return "Greetings from Spring Boot!";
    }
}
