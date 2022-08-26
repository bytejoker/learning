package com.bytejoker.learning.patterns.strategy.client;

import com.bytejoker.learning.patterns.strategy.behavior.impl.FlyNoWay;
import com.bytejoker.learning.patterns.strategy.behavior.impl.Squeak;
import com.bytejoker.learning.patterns.strategy.client.parent.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
}
