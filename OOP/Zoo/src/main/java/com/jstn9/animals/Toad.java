package com.jstn9.animals;

import com.jstn9.behaviors.Swimmable;
import com.jstn9.types.Amphibians;

public class Toad extends Amphibians implements Swimmable {
    public Toad(String name, int age, String species, boolean isPoisonous, String skinType, boolean canRegenerate) {
        super(name, age, species, isPoisonous, skinType, canRegenerate);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " likes to swim on its back.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a sound: " + "Croak");
    }
}
