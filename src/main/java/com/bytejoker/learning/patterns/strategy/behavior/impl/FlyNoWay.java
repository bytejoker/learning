package com.bytejoker.learning.patterns.strategy.behavior.impl;

import com.bytejoker.learning.patterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
