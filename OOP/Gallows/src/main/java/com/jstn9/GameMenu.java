package com.jstn9;

import java.util.Scanner;

public class GameMenu {

    private final GameLogic gameLogic;

    public GameMenu(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    public void showMainMenu(){
        System.out.println("Welcome to Gallows!");
        Scanner src = new Scanner(System.in);

        while(true){
            System.out.println("Select an option: \n1.Play\n2.Exit");

            if(!src.hasNextInt()){
                System.out.println("Invalid input. Please enter a number.");
                src.next();
                continue;
            }
            int input = src.nextInt();

            switch (input){
                case 1 -> {
                    printGallows(6);
                    gameLogic.play();
                }
                case 2 -> {
                    System.out.println("Goodbye!");
                    return;
                }
            }
        }
    }
    public static void printGallows(int stage){
        switch (stage){
            case 0 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                    /||\\  |
                     /\\  _|_""");
            case 1 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                    /||\\  |
                     /   _|_""");
            case 2 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                    /||\\  |
                         _|_
                    """);
            case 3 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                    /||   |
                         _|_""");
            case 4 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                     ||   |
                         _|_\
                    """);
            case 5 -> System.out.println("""
                      _____
                      |   |
                     ()   |
                          |
                         _|_\
                    """);
            case 6 -> System.out.println("""
                      _____
                      |   |
                          |
                          |
                         _|_\
                    """);
        }
    }
}
