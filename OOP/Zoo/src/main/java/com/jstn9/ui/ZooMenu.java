package com.jstn9.ui;

import com.jstn9.behaviors.Flyable;
import com.jstn9.behaviors.Swimmable;
import com.jstn9.behaviors.Walkable;
import com.jstn9.types.Animal;
import com.jstn9.utils.Util;

import java.util.List;

public class ZooMenu {

    private final Util util;
    private final List<Animal> animalList;
    private static final int MENU_MIN_OPTION = 1;
    private static final int MENU_MAX_OPTION = 4;

    public ZooMenu(Util util, List<Animal> animalList) {
        this.util = util;
        this.animalList = animalList;
    }

    public void showMainMenu(){
        System.out.println("Welcome to Zoo!");

        boolean isExit = false;
        while(!isExit){
            System.out.println("Choose an option:\n1. Look at the animals\n2. Feed the animals\n3. Explore their behavior\n4. Exit");

            int choice = util.requestUserInput(MENU_MIN_OPTION, MENU_MAX_OPTION);

            switch (choice){
                case 1 -> displayAnimals();
                case 2 -> feedAnimals();
                case 3 -> showAnimalsBehaviors();
                case 4 -> {
                    isExit = true;
                    System.out.println("Goodbye!");
                }
            }
        }
    }

    private void displayAnimals() {
        System.out.println("Animals in the Zoo:");

        if(animalList.isEmpty()){
            System.out.println("There are no animals in the zoo yet.");
        }
        showAnimalsInfo();
    }

    private void feedAnimals() {
        System.out.println("Choose an animal to feed:");
        showAnimalsName();

        int choice = util.requestUserInput(1, animalList.size());
        animalList.get(choice - 1).makeSound();
        System.out.println();
    }

    private void showAnimalsBehaviors() {
        for (Animal animal : animalList){
            System.out.println("== " + animal.getName() + " ==");
            if(animal instanceof Walkable){
                ((Walkable) animal).walk();
            }
            if(animal instanceof Swimmable){
                ((Swimmable) animal).swim();
            }
            if(animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
            System.out.println();
        }
    }

    private void showAnimalsName(){
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            System.out.println((i + 1) + ". " + animal.getName());
        }
    }

    private void showAnimalsInfo(){
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            System.out.println((i + 1) + ". " + animal);
            System.out.println();
        }
    }
}
