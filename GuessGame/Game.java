package GuessGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private final int defaultMax = 10;
    private final int defaultAttempts = 5;
    private int max = defaultMax;
    private int attempts = defaultAttempts;
    private int record;
    private int secret;
    private final static Scanner sc = new Scanner(System.in);

    public void start() {
        int currAttempts = attempts;
        int prevGuess = -1;
        secret = makeSecret();
        System.out.println("I am thinking of a number");
        System.out.println("It is not more than " + max);
        System.out.printf("You have %d attempts to guess it\n", attempts);

        while (currAttempts != 0) {
            int guess = takeGuess();
            if (guess == secret) {
                win(currAttempts);
            } else if (currAttempts != 1) {
                System.out.println(getHint(guess, prevGuess, secret));
                System.out.println("You have " + (currAttempts - 1) + " attempt" + ((currAttempts - 1) == 1 ? "" : "s") + " left.");

            } else {
                lose();
            }
            prevGuess = guess;
            currAttempts--;
        }
    }

    private int makeSecret() {
        Random r = new Random();
        return r.nextInt(0, max);
    }

    private int takeGuess() {
        boolean inputValid = false;
        int guess = 0;
        while (!inputValid) {
            System.out.print("Your guess: ");
            try {
                guess = sc.nextInt();
                System.out.print("\n");
                if (guess > max || guess < 0) {
                    System.out.println("Don`t be silly.");
                } else {
                    inputValid = true;
                }
            }
            catch (InputMismatchException _){
                System.out.println("Don`t be silly.");
                sc.nextLine(); // skip the invalid input to avoid an infinite loop
            }

        }

        return guess;
    }

    private String getHint(int guess, int prevGuess, int secret) {
        String hint;

        if (prevGuess == -1) {
            hint = Math.abs(secret - guess) < (max / 2) ? "Warm" : "Cold";
        } else {
            hint = Math.abs(secret - guess) < Math.abs(secret - prevGuess) ? "Warmer" : "Colder";
        }
        return hint;
    }

    private void win(int remainingAttempts) {
        System.out.println("You've guessed it!\nCongratulations!");

        //get record
        if (remainingAttempts > record) {
            record = remainingAttempts;
            System.out.println("You have a new record!");
            System.out.println("You guessed the number still having " + record + " attempt" + (record == 1 ? "" : "s") + " left.");
        }
        playAgain();
    }

    private void playAgain() {
        System.out.println("Would you like to play again? [Y/n]");
        String userInput = sc.next();

        userInput = userInput.toLowerCase();

        Set<String> yesResponses = Set.of("y", "yes", "yeah", "pls", "please");

        //restart game if yes
        if (yesResponses.contains(userInput) || userInput.isEmpty()) {
            System.out.println("\n\n");
            start();
        } else {
            endGame();
        }
    }

    private void endGame() {
        System.out.println("Your current record is: " + record);
        System.out.println("You managed to guess the number in " + record + " attempt" + (record == 1 ? "" : "s") + " left.");

        System.out.println("\nSee you next time!");
    }

    public void changeDifficulty(Difficulties diff) {
        switch (diff) {
            case EASY:
                attempts = 4;
                max = 10;
                break;
            case NORMAL:
                attempts = 6;
                max = 20;
                break;
            case HARD:
                attempts = 10;
                max = 50;
                break;
            case IMPOSSIBLE:
                attempts = 12;
                max = 150;
                break;
            default:
                attempts = defaultAttempts;
                max = defaultMax;
        }
    }


    private void lose() {
        System.out.println("You lose");
        System.out.println("My number was: " + secret);
        playAgain();
    }


    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
