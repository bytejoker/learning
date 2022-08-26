package com.bytejoker.learning.patterns.decorator;

public class Whip extends CondimentDecorator {
    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
