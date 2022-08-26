package com.bytejoker.learning.patterns.strategy.client;

import com.bytejoker.learning.patterns.strategy.behavior.impl.FlyWithWings;
import com.bytejoker.learning.patterns.strategy.behavior.impl.Quack;
import com.bytejoker.learning.patterns.strategy.client.parent.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
