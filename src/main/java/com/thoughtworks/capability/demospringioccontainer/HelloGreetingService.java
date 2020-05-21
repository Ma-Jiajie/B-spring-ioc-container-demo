package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class HelloGreetingService implements GreetingService {

    @Override
    public String sayHi() {
        return "hello world";
    }
}
