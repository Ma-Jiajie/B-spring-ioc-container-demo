package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }
}
