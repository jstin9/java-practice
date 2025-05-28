package com.jstn9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static com.jstn9.GameMenu.printGallows;

public class GameLogic {
    private List<String> words;
    private String guessWord;
    private final Set<Character> guessedLetters = new HashSet<>();

    public GameLogic() {
        try {
            words = Files.readAllLines(Path.of("src/main/resources/words.txt"));
        } catch (IOException e) {
            System.out.println("Error reading word file: " + e.getMessage());
            words = new ArrayList<>();
        }
    }

    public void play() {
        Scanner src = new Scanner(System.in);

        guessWord = pickRandomWord().toLowerCase();

        guessedLetters.clear();

        int attemptsLeft = 6;

        while(attemptsLeft > 0){
            showGuessWord();
            System.out.println("Enter a letter:");
            String input = src.nextLine().toLowerCase();

            if(input.length() != 1 || !Character.isLetter(input.charAt(0))){
                System.out.println("Please enter a single valid letter.");
                continue;
            }

            char letter = input.charAt(0);
            if (guessedLetters.contains(letter)) {
                System.out.println("You already guessed this letter.");
                continue;
            }

            guessedLetters.add(letter);

            if(!guessWord.contains(String.valueOf(letter))){
                attemptsLeft--;
                System.out.println("Wrong guess! Attempts left: " + attemptsLeft);
                printGallows(attemptsLeft);
            }

            if(isWordGuessed()){
                System.out.println("Congratulations! You guessed the word: " + guessWord);
                return;
            }
        }
        System.out.println("Game over! The word was: "  + guessWord);
    }

    public String pickRandomWord(){
        if(words.isEmpty()){
            System.out.println("The txt file is empty!");
            return "default";
        } else {
            Random random = new Random();
            return words.get(random.nextInt(words.size()));
        }
    }

    public void showGuessWord(){
        StringBuilder display = new StringBuilder();
        for (char c : guessWord.toCharArray()){
            if(guessedLetters.contains(c)){
                display.append(c).append(' ');
            } else {
                display.append('_').append(' ');
            }
        }
        System.out.println(display.toString().trim());
    }

    private boolean isWordGuessed(){
        for (char c : guessWord.toCharArray()){
            if (!guessedLetters.contains(c)){
                return false;
            }
        }
        return true;
    }
}
