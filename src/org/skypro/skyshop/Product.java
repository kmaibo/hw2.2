package org.skypro.skyshop;

public class Product {
    private String nameProduct;
    private int price;


    public Product(String name, int priceProduct) {
        this.nameProduct = name;
        this.price = priceProduct;
    }

    public String getName() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Product: " + nameProduct + ". Price: " + price;
    }


}


