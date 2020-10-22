package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerForGreeter {
    private final IGreeter iGreeter;

    @Autowired
    public TestControllerForGreeter(@Qualifier("test1ForGreeter") IGreeter iGreeter) {
        this.iGreeter = iGreeter;
        System.out.println("Test the controller is a instant in Ioc or not.");
    }

    @GetMapping("/test")
    public void testGreeter() {
        iGreeter.test();
    }
}
