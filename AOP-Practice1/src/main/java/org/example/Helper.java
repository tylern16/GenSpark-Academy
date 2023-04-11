package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

    @Before("execution(public void sayHello())")
    public void logOpen() {
        System.out.println("Open Log");
    }

    @Before("execution(public void sayHello())")
    public void dataValid() {
        System.out.println("Data Validate Start");
    }

    @After("execution(public void sayHello())")
    public void logClose() {
        System.out.println("Close Log");
    }

    @After("execution(public void sayHello())")
    public void dataValidEnd() {
        System.out.println("Data Validate End");
    }
}
