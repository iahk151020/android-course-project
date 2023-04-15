package com.example.courseproject;

public class Item {
    private String img, name, quantity, size, price;

    public Item(String img, String name, String quantity, String size, String price) {
        this.img = img;
        this.name = name;
        this.quantity = quantity;
        this.size = size;
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSize() {
        return size;
    }

    public String getPrice() {
        return price;
    }
}
