package com.bytejoker.learning.patterns.strategy.client;

import com.bytejoker.learning.patterns.strategy.behavior.impl.FlyNoWay;
import com.bytejoker.learning.patterns.strategy.behavior.impl.MuteQuack;
import com.bytejoker.learning.patterns.strategy.client.parent.Duck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
}
