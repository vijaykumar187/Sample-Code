package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to the Page";
    }

    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable("name") String name){
        return "Welcome to the Page " + name;
    }

}
