package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(org.example..*)")
    public void authenticatingPointCut() {
        System.out.println("authenticatingPointCut");
    }

    @Pointcut("within(org.example.ShoppingCart.*)")
    public void authorizationPointCut() {
        System.out.println("authorizationPointCut");
    }

    @Before("authenticatingPointCut() || authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the Request");
    }
}
