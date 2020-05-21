package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    private final GreetingService greetingService;

    public Greeter(GreetingService greetingService) {
        System.out.println("++++++++ Greeting is instantiating...");
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }

}
