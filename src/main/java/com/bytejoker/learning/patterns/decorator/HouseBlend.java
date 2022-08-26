package com.bytejoker.learning.patterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public int cost() {
        return 3;
    }
}
