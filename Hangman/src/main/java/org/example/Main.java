package org.example;

public class Main {
    //generate a random word
    //get input from user
    //check if input is in word
    //repeat until win/lose with drawing
    //drawing has a hangman, word with blanks, and used letters

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.sayHangman();
        hangman.makeDrawing("", "", 0);
    }
}