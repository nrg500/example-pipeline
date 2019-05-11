package com.infosupport.examplepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value="/hello")
    public String sayHello(){
        return "Hello from the HelloWorldController";
    }
}
