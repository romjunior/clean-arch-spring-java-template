package com.example;

import com.example.ports.in.UseCaseSearchExample;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
record TestController(UseCaseSearchExample example) {

    @GetMapping(value = "/greetings")
    ResponseEntity<String> getGreetings(@RequestParam(required = false) final String name) {
        return ResponseEntity.ok(example.getGreetings(name));
    }

}
