package com.bytejoker.learning.patterns.factory.simplefactory;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
