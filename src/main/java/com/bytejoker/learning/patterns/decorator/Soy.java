package com.bytejoker.learning.patterns.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
