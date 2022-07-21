package com.demo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>DEmo controller</p>
 * @date 2022-07-21 19:39
 **/
@RestController
public class DemoController {
    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }
}
