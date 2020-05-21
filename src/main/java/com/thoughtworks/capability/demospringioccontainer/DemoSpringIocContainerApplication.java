package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(DemoSpringIocContainerApplication.class);

		Greeter greeter = applicationContext.getBean(Greeter.class);

		System.out.println(greeter.greet());
	}

}
