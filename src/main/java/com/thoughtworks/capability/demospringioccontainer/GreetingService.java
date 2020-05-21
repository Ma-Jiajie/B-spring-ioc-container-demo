package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    String sayHi() {
        return "hello world";
    }
}
