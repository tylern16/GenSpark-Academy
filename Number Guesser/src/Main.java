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

    public static String setOutput(int guess, int randomNum, String name, int count) {
        if (guess > randomNum) {
            return "Your guess is too high. Guess again:";
        } else if (guess < randomNum) {
            return "Your guess is too low. Guess again:";
        } else {
            return "Good job, " + name + "! You guessed my number in " + count + " guesses!";
        }
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
                System.out.println("You did not input a number");
                System.out.println("We will assume you meant to guess " + guess);
            }

            String output = setOutput(guess, randomNum, name, count);
            System.out.println(output);
            if (output.startsWith("Good")) break;
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