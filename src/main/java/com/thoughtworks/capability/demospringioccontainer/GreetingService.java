package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingService() {
        System.out.println("++++++++ GreetingService is instantiating...");
    }

    String sayHi() {
        return "hello world";
    }
}
