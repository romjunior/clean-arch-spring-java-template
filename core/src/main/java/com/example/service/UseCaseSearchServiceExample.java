package com.example.service;

import com.example.ports.in.UseCaseSearchExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class UseCaseSearchServiceExample implements UseCaseSearchExample {
    @Override
    public String getGreetings(String name) {
        log.info("c={} m={} name={}",
                UseCaseSearchServiceExample.class.getSimpleName(),
                UseCaseSearchServiceExample.class.getMethods()[0].getName(),
                name
        );
        if(name == null) {
            return "Hello!";
        }
        return "Hello!, " + name;
    }
}
