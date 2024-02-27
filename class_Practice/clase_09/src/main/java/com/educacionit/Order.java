package com.educacionit;

public class Order {
    private int id;
    private int quantity;
    private Product product;
    public Order(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public float orderSubtotal() {
        return quantity * product.getPrice();
    }
    @Override
    public String toString() {
        return "Order [id=" + id + ", quantity=" + quantity + ", product=" + product + "]";
    }
    
}
