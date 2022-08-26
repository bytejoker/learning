package com.bytejoker.learning.patterns.factory.factorymethod;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(PizzaType type);
}
