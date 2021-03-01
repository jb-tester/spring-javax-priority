package com.mytests.spring.priority_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        UseServicesByPriority bean = context.getBean(UseServicesByPriority.class);
        System.out.println(bean);
    }

   
}
