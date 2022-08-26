package com.bytejoker.learning.patterns.factory.factorymethod;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYStyleCheesePizza();
            default:
                throw new IllegalArgumentException(type.toString());
        }
    }
}
