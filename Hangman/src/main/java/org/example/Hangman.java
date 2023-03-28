package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//todo
//input is longer than 1 char


public class Hangman {

    public void sayHangman() {
        System.out.println("H A N G M A N");
    }

    RandomWord r = new RandomWord();
    String randomWord = r.genRandomWord();


    public String getInput(){
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return "";
        }
    }


    public String drawHangman(int count, String randomWord) {
        return switch (count) {
            case 0 -> """
                     +-----+
                           |
                           |
                           |
                           |
                           |
                           |
                    ==========
                     """;
            case 1 -> """
                     +-----+
                     O     |
                           |
                           |
                           |
                           |
                           |
                    ==========
                     """;
            case 2 -> """
                     +-----+
                     O     |
                     |     |
                           |
                           |
                           |
                           |
                    ==========
                     """;
            case 3 -> """
                     +-----+
                     O     |
                     |\\    |
                           |
                           |
                           |
                           |
                    ==========
                     """;
            case 4 -> """
                     +-----+
                     O     |
                    /|\\    |
                           |
                           |
                           |
                           |
                    ==========
                     """;
            case 5 -> """
                     +-----+
                     O     |
                    /|\\    |
                      \\    |
                           |
                           |
                           |
                    ==========
                     """;
            case 6 -> """
                     +-----+
                     O     |
                    /|\\    |
                    / \\    |
                           |
                           |
                           |
                    ==========
                    Game over, You lose.
                     """ +
                    "The secret word was " + randomWord;
            default -> null;
        };
    }


    public String showCorrectLetters(String correctLetters, String randomWord) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(randomWord.split(""))
                .forEach(c -> {
                    if (correctLetters.contains(c)) {
                        sb.append(c);
                    } else {
                        sb.append("_");
                    }
                });
        return sb.toString();
    }


    public Boolean checkForWin(String randomWord, String correctLetters) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (!correctLetters.contains(String.valueOf(randomWord.charAt(i)))) return false;
        }
        return true;
    }

    public void askToPlayAgain() {
        System.out.println("Would you like to play again? (y or n)");
        Scanner sc = new Scanner(System.in);
        String input = "";
        try {
            input = sc.nextLine();
        } catch(NoSuchElementException e) {
            System.out.println(e);
            input = "";
        }
        if (input.equals("y")) {
            Hangman hangman = new Hangman();
            hangman.sayHangman();
            hangman.makeDrawing("", "", 0);
        } else {
            System.exit(0);
        }
    }


    public void makeDrawing(String missedLetters, String correctLetters, int incorrectCount){
        //win condition
        if (checkForWin(randomWord, correctLetters)) {
            System.out.println("You win! The secret word was " + randomWord);
            askToPlayAgain();
        }
        //lose condition
        if (incorrectCount == 6) {
            System.out.println(drawHangman(incorrectCount, randomWord));
            askToPlayAgain();
        }
        System.out.println(drawHangman(incorrectCount, randomWord));
        System.out.println("Wrong Letters: " + missedLetters);
        System.out.println(showCorrectLetters(correctLetters, randomWord));
        System.out.println("Guess a letter: ");

        String input = getInput();
        while (input.length() != 1) {
            System.out.println("Enter 1 letter please");
            input = getInput();
        }

        if (randomWord.contains(input)) {
            makeDrawing(missedLetters, correctLetters + input, incorrectCount);
        } else {
            makeDrawing(missedLetters+input, correctLetters,  incorrectCount+1);
        }
    }
}
