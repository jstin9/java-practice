package com.jstn9.utils;

import java.util.Scanner;

public class Util {
    public int requestUserInput(int min, int max) {
        Scanner src = new Scanner(System.in);
        int input;

        while (true){
            if(src.hasNextInt()) {
                input = src.nextInt();
                if(input >= min && input <= max){
                    return input;
                }
            }else {
                src.next();
            }
            System.out.println("Invalid input! Enter a number between " + min + " and " + max);
        }
    }
}
