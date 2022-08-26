package com.bytejoker.learning.patterns.strategy.behavior.impl;

import com.bytejoker.learning.patterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
