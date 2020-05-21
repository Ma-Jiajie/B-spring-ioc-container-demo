package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GreetingService {

    public GreetingService() {
        System.out.println("++++++++ GreetingService is instantiating...");
    }

    String greet() {
        return "hello world";
    }

    @PostConstruct
    public void inti() {
        System.out.println("++++++++ GreetingService is initializing...");
    }

    @PreDestroy
    public void releaseSomeResources() {
        System.out.println("++++++++ GreetingService is releasing some resources...");
    }
}
