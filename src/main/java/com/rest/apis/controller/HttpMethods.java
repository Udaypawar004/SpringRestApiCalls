package com.rest.apis.controller;

import com.rest.apis.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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


    // method to post user in arraylist
    ArrayList<User> users = new ArrayList<>();
    @PostMapping("/hello/post")
    public boolean userDTO(@RequestBody User user) {
        return this.users.add(user);
    }

    // method to put user at index 0 in arraylist
    @PutMapping("/hello/put/{firstName}")
    public User putMethod(@PathVariable String firstName, @RequestParam String lastName){
        User user = new User(firstName, lastName);
        users.add(0, user);
        return users.get(0);
    }
}
