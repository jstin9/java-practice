package com.jstn9.animals;

import com.jstn9.behaviors.Walkable;
import com.jstn9.types.Mammals;

public class Cat extends Mammals implements Walkable {
    public Cat(String name, int age, String species, boolean hasFur, String furColor, boolean isPredator) {
        super(name, age, species, hasFur, furColor, isPredator);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a sound: " + "Meow");
    }
}
