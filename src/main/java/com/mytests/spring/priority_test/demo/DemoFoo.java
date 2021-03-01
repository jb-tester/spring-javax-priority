package com.mytests.spring.priority_test.demo;

import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
@Priority(DemoFoo.FOO)
public class DemoFoo implements DemoService {

    public static final int FOO = 10;

    @Override
    public String toString() {
        return "DemoFoo";
    }
}
