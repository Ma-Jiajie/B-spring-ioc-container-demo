package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("hi")
@Component
public class HiGreetingService implements GreetingService {

    @Override
    public String sayHi() {
        return "hi world";
    }
}
