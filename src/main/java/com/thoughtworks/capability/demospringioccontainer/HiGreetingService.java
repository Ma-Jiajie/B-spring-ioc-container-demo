package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class HiGreetingService implements GreetingService {

    @Override
    public String sayHi() {
        return "hi world";
    }
}
