package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gld/hello")
public class WelcomeController {

    @GetMapping
    public String Hello() {
        return "helloooo";
    }


}
