package com.mytests.spring.priority_test.metapriority;

import javax.annotation.Priority;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * *
 * <p>Created by irina on 01.03.2021.</p>
 * <p>Project: spring-javax-priority</p>
 * *
 */
@Target({TYPE,PARAMETER})
@Retention(RUNTIME)
@Documented
@Priority(2)
public @interface MySecondPriority {
}
