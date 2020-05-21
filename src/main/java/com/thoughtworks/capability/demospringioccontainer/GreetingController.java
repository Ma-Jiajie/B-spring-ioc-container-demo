package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController() {
        this.greetingService = new GreetingService();
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.sayHi();
    }

}
