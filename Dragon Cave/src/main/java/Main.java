package main.java;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String choice = null;

    public static void playGame() {
        System.out.println("""
                You are in a land full of dragons. In front of you, you see two caves.\s
                In one the dragon is friendly and will share his treasure with you.\s
                 The other dragon is greedy and hungry and will eat you on sight.\s
                 Which cave will you go into? (1 or 2)
                """         );

        try {
            choice = sc.nextLine();
        } catch (NoSuchElementException e ){
            System.out.println(e);
        }

        String output = decision(choice);

        System.out.println(output);
    }


    public static String decision(String c) {
        if (c.equals("1")) {
            return """
                    You approach the cave...\s
                    It is dark and spooky...\s
                    A large dragon jumps out in front of you! He opens his jaw and...\s
                    Gobbles you down in one bites!
                    """;
        } else if (c.equals("2")){
            return "The dragon shares his gold with you!";
        } else {
            return "Invalid input";
        }
    }


    public static void main(String[] args) {
        playGame();
    }
}