package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {
    //    .. là áp dụng cho taats cả các phương thức có hoặc không có tham số truyền vào
//    đây là join point
    @After("execution(* org.example.ShoppingCart.*(..))")
    public void logAfterMethodCall(JoinPoint joinPoint) {
//        Lấy tên phương thức được gọi
        String nameMethod = joinPoint.getSignature().getName();
        System.out.println("Tên phương thức "+nameMethod);
    }
}
