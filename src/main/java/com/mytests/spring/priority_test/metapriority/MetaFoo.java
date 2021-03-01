package com.mytests.spring.priority_test.metapriority;

import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 01.03.2021.</p>
 * <p>Project: spring-javax-priority</p>
 * *
 */
@MyFirstPriority @Service
public class MetaFoo implements MetaService {
    @Override
    public String toString() {
        return "MetaFoo";
    }
}
