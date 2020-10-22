package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Test2ForGreeter implements IGreeter{
    public Test2ForGreeter() {
        System.out.println("test 222222");
    }

    @Override
    public void test() {
        System.out.println("test 2");
    }
}
