package com.springboot.newSpring.AppController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping(path = "/Greet")
    public String Greeting(){
        return "Hello to my channel";
    }

}
