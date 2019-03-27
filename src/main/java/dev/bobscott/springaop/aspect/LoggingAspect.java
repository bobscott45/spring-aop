package dev.bobscott.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccount() {
        System.out.println("Before add account");
    }

    @After("execution(public void addAccount())")
    public void afterAddAccount() {
        System.out.println("After add account");
    }
}
