package com.jstn9;

public class Main {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        GameMenu gameMenu = new GameMenu(gameLogic);
        gameMenu.showMainMenu();
    }
}