package com.educacionit;

import java.util.ArrayList;

public class Purchase_Order {
   private int id;
   private ArrayList<Order> orders = new ArrayList<Order>(); ///
    public Purchase_Order(int id) {
        this.id = id;
        //this.orders = new ArrayList
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void addItem(int id,int quantity,Product product) {
        Order new_Order = new Order(id, quantity,product);
        orders.add(new_Order);
    }
    public float orderTotal(){
        float total = 0;
        for(int i=0;i<orders.size();i++){
            Order order_aux = orders.get(i);
            total += order_aux.orderSubtotal();
        }
        return total;
    }
    @Override
    public String toString() {
        return "Purchase_Order [id=" + id + ", orders=" + orders + "]";
    }
}
