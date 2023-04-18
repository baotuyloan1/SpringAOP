package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status, int point){
        System.out.println("Checkout Method from ShoppingCart called" + status + point);
    }

    public int quantity(){
        return 2;
    }
}
