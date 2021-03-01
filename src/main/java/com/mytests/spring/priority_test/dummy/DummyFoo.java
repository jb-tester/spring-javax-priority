package com.mytests.spring.priority_test.dummy;

import org.springframework.stereotype.Service;

import javax.annotation.Priority;

/**
 * *
 * <p>Created by irina on 21.01.2021.</p>
 * <p>Project: spring-javax-priority</p>
 * *
 */
@Priority(123456788) @Service
public class DummyFoo implements DummyService {
    @Override
    public String toString() {
        return "DummyFoo";
    }
}
