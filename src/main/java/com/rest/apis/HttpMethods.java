package com.rest.apis;

import org.springframework.web.bind.annotation.*;

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

    // method to get params
    @GetMapping("hello/param/{name}")
    public String nameWithparam(@PathVariable String name){
        return "hello! " + name;
    }
}
