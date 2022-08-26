package com.bytejoker.learning.patterns.factory.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CheesePizza("CheesePizza");
            case PEPPERONI -> new PepperoniPizza("PepperoniPizza");
            case CLAM -> new ClamPizza("ClamPizza");
            case VEGGIE -> new VeggiePizza("VeggiePizza");
        };
    }
}
