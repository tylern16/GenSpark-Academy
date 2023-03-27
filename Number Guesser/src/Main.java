import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! What is your name?");

        String name;
        try {
            name = sc.nextLine();
        } catch (IllegalStateException e) {
            name = "Player";
            System.out.println(e);
        }


        playGame(name);
    }

    public static void playGame(String name) throws InputMismatchException {
        int randomNum = (int) Math.ceil(Math.random()*20);

        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess");

        int count = 1;
        while (count <= 6) {

            int guess;
            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
                guess = (int) Math.ceil(Math.random()*20);
                System.out.println("Ypu did not input a number");
                System.out.println("We will assume you meant to guess " + guess);
            }

            if (guess > randomNum) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            } else if (guess < randomNum) {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            } else if (guess == randomNum) {
                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
                break;
            }
            count++;
        }

        if (count == 6) System.out.println("You didn't get it in 6 guesses. I win!");

        System.out.println("Would you like to play again? (y or n)");

        String ans;
        try {
            ans = sc.next();
        } catch (IllegalStateException e) {
            System.out.println(e);
            ans = "n";
        }

        if (ans.equals("y")) {
            playGame(name);
        }
    }
}