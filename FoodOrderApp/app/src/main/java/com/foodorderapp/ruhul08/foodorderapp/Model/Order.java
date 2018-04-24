package com.foodorderapp.ruhul08.foodorderapp.Model;

public class Order {

    private String ProduId;
    private String ProduName;
    private String Quantity;
    private String Price;
    private String Discount;

    public Order() {

    }

    public Order(String produId, String produName, String quantity, String price, String discount) {
        ProduId = produId;
        ProduName = produName;
        Quantity = quantity;
        Price = price;
        Discount = discount;
    }

    public String getProduId() {
        return ProduId;
    }

    public void setProduId(String produId) {
        ProduId = produId;
    }

    public String getProduName() {
        return ProduName;
    }

    public void setProduName(String produName) {
        ProduName = produName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }
}
