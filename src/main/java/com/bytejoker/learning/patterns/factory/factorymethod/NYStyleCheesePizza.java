package com.bytejoker.learning.patterns.factory.factorymethod;

import java.util.Arrays;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        setName("NYStyleCheesePizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        setToppings(List.of("Grated Reggiano Cheese"));
    }
}
