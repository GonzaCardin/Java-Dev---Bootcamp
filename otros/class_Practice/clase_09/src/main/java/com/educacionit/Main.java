package com.educacionit;

public class Main {
    public static void main(String[] args){
        Purchase_Order Purchase = new Purchase_Order(261201);
        
        Product product_1 = new Product(1000,"Bread",1200);
        Product product_2 = new Product(1001,"Milk",1100.5F);
        
        Purchase.addItem(1, 7, product_1);
        Purchase.addItem(2, 3, product_2);
        
        float total = Purchase.orderTotal();
        System.out.println("Your purchase total is $" + total);
        System.out.println(Purchase);
        System.out.println(product_1);
    }
}
