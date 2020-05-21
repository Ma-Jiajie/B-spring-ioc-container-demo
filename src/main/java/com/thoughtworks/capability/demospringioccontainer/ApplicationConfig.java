package com.thoughtworks.capability.demospringioccontainer;

import com.thoughtworks.capability.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.thoughtworks.capability.service")
@Configuration
public class ApplicationConfig {
}
