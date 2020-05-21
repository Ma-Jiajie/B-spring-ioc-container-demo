package com.thoughtworks.capability.demospringioccontainer;

public class Greeter {

    private final GreetingService greetingService;

    public Greeter() {
        greetingService = new GreetingService();
    }

    public String greet() {
        return greetingService.greet();
    }

}
