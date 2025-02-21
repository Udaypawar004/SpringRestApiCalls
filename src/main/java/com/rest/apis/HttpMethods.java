package com.rest.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HttpMethods {
    // Method to show hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // method for request params
    @GetMapping("/hello/query")
    public String sayMyName(@RequestParam String name){
        return "hello! " + name ;
    }
}
