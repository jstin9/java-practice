package com.jstn9;

import com.jstn9.animals.Cat;
import com.jstn9.animals.Parrot;
import com.jstn9.animals.Toad;
import com.jstn9.types.Animal;
import com.jstn9.ui.ZooMenu;
import com.jstn9.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        Cat cat = new Cat("Masya", 7, "Cat", true, "Gray", false);
        Parrot parrot = new Parrot("Kesha", 3, "Parrot", 0.5, true, "Green");
        Toad toad = new Toad("Bumpy", 2, "Toad", false, "Warty", true);

        animalList.add(cat);
        animalList.add(parrot);
        animalList.add(toad);

        Util util = new Util();
        ZooMenu zooMenu = new ZooMenu(util, animalList);
        zooMenu.showMainMenu();
    }
}