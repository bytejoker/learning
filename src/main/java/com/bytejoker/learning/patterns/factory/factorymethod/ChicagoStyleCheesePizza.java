package com.bytejoker.learning.patterns.factory.factorymethod;

import java.util.Arrays;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("ChicagoStyleCheesePizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        setToppings(List.of("Shredded Mozzarella Cheese"));
    }
}
