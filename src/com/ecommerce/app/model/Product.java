package com.ecommerce.app.model;

public class Product {
    private Long id;
    private String name;
    private int cost;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private int qty;
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     public Product(String name, int cost, int qty) {
        this.name = name;
        this.cost = cost;
        this.qty = qty;
    }
    public Product(Long id, String name, int cost, int qty) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.qty = qty;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        if(product.getName().equals(this.getName())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cost + " " + qty;
    }
}
