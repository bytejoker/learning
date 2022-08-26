package com.bytejoker.learning.patterns.decorator;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Soy(new Whip(new Espresso())));
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
