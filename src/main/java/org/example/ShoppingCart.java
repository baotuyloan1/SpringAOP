package org.example;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class ShoppingCart {

    public void checkout(String status, int point){
        System.out.println("Checkout Method from ShoppingCart called" + status + point);
    }

    public void checkout1(){
        System.out.println("Checkout 1 Method from ShoppingCart  called");
    }
}
