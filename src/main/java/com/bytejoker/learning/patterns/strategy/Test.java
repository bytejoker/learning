package com.bytejoker.learning.patterns.strategy;

import com.bytejoker.learning.patterns.strategy.client.DecoyDuck;
import com.bytejoker.learning.patterns.strategy.client.MallardDuck;
import com.bytejoker.learning.patterns.strategy.client.RubberDuck;
import com.bytejoker.learning.patterns.strategy.client.parent.Duck;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Duck> ducks = List.of(new DecoyDuck(), new RubberDuck(), new MallardDuck());
        ducks.forEach(Duck::performFly);
        ducks.forEach(Duck::performQuack);
    }
}
