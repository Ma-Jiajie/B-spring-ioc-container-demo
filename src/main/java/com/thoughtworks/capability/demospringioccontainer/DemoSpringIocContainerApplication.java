package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		GreetingService greetingService = new GreetingService();
		Greeter greeter = new Greeter(greetingService);
		System.out.println(greeter.greet());
	}

}
