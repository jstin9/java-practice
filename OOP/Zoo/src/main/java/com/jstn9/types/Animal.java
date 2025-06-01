package com.jstn9.types;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Species: " + species;
    }

    public String getName() {
        return name;
    }
}
