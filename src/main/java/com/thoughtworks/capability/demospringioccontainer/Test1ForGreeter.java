package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Test1ForGreeter implements IGreeter{
    public Test1ForGreeter() {
        System.out.println("test 11111");
    }

    @Override
    public void test() {
        System.out.println("test 1");
    }
}
