package com.example.courseproject;

public class Pizza {

    private String name, description, imgSrc;
    private int rating, stock, id;

    public Pizza(String name, String description, String imgSrc, int rating, int stock, int id) {
        this.name = name;
        this.description = description;
        this.imgSrc = imgSrc;
        this.rating = rating;
        this.stock = stock;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public int getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public int getId() {
        return id;
    }
}
