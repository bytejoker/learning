package com.bytejoker.learning.patterns.factory.factorymethod;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            default:
                throw new IllegalArgumentException(type.toString());
        }
    }
}
