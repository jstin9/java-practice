package com.jstn9.animals;

import com.jstn9.behaviors.Flyable;
import com.jstn9.types.Birds;

public class Parrot extends Birds implements Flyable {
    public Parrot(String name, int age, String species, double wingSpan, boolean canFly, String featherColor) {
        super(name, age, species, wingSpan, canFly, featherColor);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flaps its wings and flies.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a sound: " + "Squawk");
    }
}
