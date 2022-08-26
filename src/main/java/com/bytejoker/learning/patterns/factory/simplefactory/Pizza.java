package com.bytejoker.learning.patterns.factory.simplefactory;

public abstract class Pizza {
    private final String name;

    Pizza(String name) {
        this.name = name;
    }

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

    public String getName() {
        return name;
    }
}
