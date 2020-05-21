package com.thoughtworks.capability.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String sayHi() {
        return "hello world";
    }
}
