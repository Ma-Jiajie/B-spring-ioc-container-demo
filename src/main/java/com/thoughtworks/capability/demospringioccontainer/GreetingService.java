package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public GreetingService() {
        System.out.println("++++++++ GreetingService is instantiating...");
    }

    String greet() {
        return "hello world";
    }
}
