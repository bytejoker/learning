package com.bytejoker.learning.patterns.factory.factorymethod;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        Pizza nyPizza = nyStylePizzaStore.orderPizza(PizzaType.CHEESE);
        Pizza chicagoPizza = chicagoStylePizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
