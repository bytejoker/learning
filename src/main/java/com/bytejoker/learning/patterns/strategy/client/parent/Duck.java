package com.bytejoker.learning.patterns.strategy.client.parent;

import com.bytejoker.learning.patterns.strategy.behavior.FlyBehavior;
import com.bytejoker.learning.patterns.strategy.behavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public final void swim() {
        System.out.println("standard swim");
    }

    public final void display() {
        System.out.println("standard display");
    }

    public final QuackBehavior setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this.quackBehavior;
    }

    public final FlyBehavior setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this.flyBehavior;
    }

    public final void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        } else {
            System.out.println("No FlyBehavior");
        }
    }

    public final void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        } else {
            System.out.println("No QuackBehavior");
        }
    }

}
