package org.skypro.skyshop;

public class ProductBasket {
    private Product[] products = new Product[5];
    private int size = 0;
    Product product;


    public void addProduct(Product product) {
        if (size >= 5) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        products[size++] = product;
    }


    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }


    public void printBasket() {
        if (size == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getName() + ": " + products[i].getPrice());
        }
        System.out.println("Итого: " + getTotalCost());
    }


    public boolean hasProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        for (int i = 0; i < size; i++) {
            products[i] = null;
        }
        size = 0;
    }
}