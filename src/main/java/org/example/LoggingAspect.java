package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(void org.example.ShoppingCart.checkout(..))")
    public void beforeLogger (){
        System.out.println("Before Loggers");
    }

//    * đầu tiên: return type của phương thức thực hiện (checkout()), * có nghĩa là bất cứ kiểu giá trị trả về
//    ** 2,3 : package. * thì là bất cứ package
//    * 4 : class. * bất cứ class nào
//    * 5 : bất cứ phương thức nào
    @After("execution(* *.*.*.checkout(String,int))")
    public void afterLogger(){
        System.out.println("After Logger");
    }
}
