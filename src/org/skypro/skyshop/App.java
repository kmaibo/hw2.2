package org.skypro.skyshop;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        Product apple = new Product("Яблоко", 50);
        Product banana = new Product("Банан", 30);
        Product orange = new Product("Апельсин", 40);
        Product pear = new Product("Груша", 60);
        Product grape = new Product("Виноград", 70);
        Product melon = new Product("Арбуз", 200);

        basket.addProduct(apple);
        basket.addProduct(banana);
        basket.addProduct(orange);
        basket.addProduct(pear);
        basket.addProduct(grape);

        basket.printBasket();

        System.out.println("Общая стоимость: " + basket.getTotalCost());

        System.out.println("Есть ли яблоко? " + basket.hasProduct("Яблоко"));
        System.out.println("Есть ли арбуз? " + basket.hasProduct("Арбуз"));

        basket.clearBasket();

        basket.printBasket();
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalCost());
        System.out.println("Есть ли яблоко в пустой корзине? " + basket.hasProduct("Яблоко"));
    }
}
