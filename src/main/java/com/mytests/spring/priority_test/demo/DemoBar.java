package com.mytests.spring.priority_test.demo;

import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component
@Priority(DemoBar.BAR)
public class DemoBar implements DemoService {

    public static final int BAR = 20;

    @Override
    public String toString() {
        return "DemoBar";
    }
}
