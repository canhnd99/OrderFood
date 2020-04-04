package com.laptrinhb2a.app.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class CustomerApi {

    @GetMapping(value = "/customer")
    public String home() {
        return "Hello World";
    }
}
