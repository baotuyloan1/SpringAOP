package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(void org.example.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        String argString = jp.getArgs()[0].toString();
        String argInt = jp.getArgs()[1].toString();
        System.out.println("Before Loggers with Argument: " + argString + " - " + argInt);
    }

    //    * đầu tiên: return type của phương thức thực hiện (checkout()), * có nghĩa là bất cứ kiểu giá trị trả về
//    ** 2,3 : package. * thì là bất cứ package
//    * 4 : class. * bất cứ class nào
//    * 5 : bất cứ phương thức nào
    @After("execution(* *.*.*.checkout(String,int))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @Pointcut("execution(* org.example..quantity(..))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning");
    }
}
