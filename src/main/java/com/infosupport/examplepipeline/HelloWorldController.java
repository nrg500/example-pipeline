package com.infosupport.examplepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value="/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello from " + name;
    }
}