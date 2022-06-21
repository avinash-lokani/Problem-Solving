package com.ecommerce.v1;

public class ItemDetails {

    String description;
    int cost;

    int qty;


    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemDetails(String description, int cost, int qty) {
        this.description = description;
        this.cost = cost;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return description + " " + cost ;
    }
}
