package com.bytejoker.learning.patterns.factory.factorymethod;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public final void prepare() {
        System.out.println("Prepare " + name + " Pizza");
    }

    public final void bake() {
        System.out.println("Bake " + name + " Pizza");
    }

    public final void cut() {
        System.out.println("Cut " + name + " Pizza");
    }

    public final void box() {
        System.out.println("Box " + name + " Pizza");
    }
}
