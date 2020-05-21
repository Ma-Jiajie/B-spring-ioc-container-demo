package com.thoughtworks.capability.demospringioccontainer;

public class Greeter {

    private final GreetingService greetingService;

    public Greeter(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }

}
