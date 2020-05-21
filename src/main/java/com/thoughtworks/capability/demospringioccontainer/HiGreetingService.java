package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class HiGreetingService implements GreetingService {

    @Override
    public String sayHi() {
        return "hi world";
    }
}
