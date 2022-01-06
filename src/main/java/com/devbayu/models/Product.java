package com.devbayu.models;

public class Product {
    private String nameOfProduct;
    private String description;
    private String imageLink;
    private String price;
    private String rating;
    private String nameOfMerchant;

    public Product() {
    }

    public Product(String nameOfProduct, String description, String imageLink, String price, String rating, String nameOfMerchant) {
        this.nameOfProduct = nameOfProduct;
        this.description = description;
        this.imageLink = imageLink;
        this.price = price;
        this.rating = rating;
        this.nameOfMerchant = nameOfMerchant;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNameOfMerchant() {
        return nameOfMerchant;
    }

    public void setNameOfMerchant(String nameOfMerchant) {
        this.nameOfMerchant = nameOfMerchant;
    }
}
