package GuessGame;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private final int defaultMax = 10;
    private final int defaultAttempts = 5;
    private int max = defaultMax;
    private int attempts = defaultAttempts;
    private int record;
    private final static Scanner sc = new Scanner(System.in);

    public void start() {
        record = attempts;
        final int secret = makeSecret();
        System.out.println("I am thinking of a number");
        System.out.println("It is not more than " + max);
        System.out.printf("You have %d attempts to guess it\n", attempts);

        for (int i = attempts; i > 0; i--){
            int guess = takeGuess();
            if (guess == secret){
                win(i);
            }
            else{
                giveHint(guess);
            }
        }
        lose();
    }

    private int makeSecret(){
        Random r = new Random();
        return r.nextInt(0,max);
    }
    private int takeGuess(){
        System.out.print("Your guess: ");
        int guess = sc.nextInt();
        System.out.print("\n");

        return guess;
    }

    private void giveHint(int guess){
        System.out.println("Hint!");

    }
    private void win(int attempts){
        System.out.println("You guessed it!\nCongratulations");
        System.out.println("Would you like to play again? [Y/n]");

        //get record
        if (attempts < record){
            record = attempts;
            System.out.println("You have a new record!");
            System.out.printf("You guessed the number in %d attempts",attempts);
        }

        //scan user input
        String userInput = sc.next();

        userInput = userInput.toLowerCase();

        Set<String> yesResponses = Set.of("y","yes","yeah","pls","please");

        //restart game if yes
        if (yesResponses.contains(userInput) && userInput.isEmpty()){
            System.out.println("\n\n");
            start();
        }

        //end game if else
        else {
            System.out.println("Your current record is: "+record);
            System.out.printf("You managed to guess the number in %d attempts\n",record);
            System.out.println("\nSee you next time!");
        }
    }

    private void lose(){
        System.out.println("You lose");
    }


    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void changeDifficulty(Difficulties diff){
        switch (diff){
            case EASY:
                attempts = 5;
                max = 10;
                break;
            case NORMAL:
                attempts = 10;
                max = 20;
                break;
            case HARD:
                attempts = 12;
                max = 30;
            case IMPOSSIBLE:
                attempts = 25;
                max = 100;
            default:
                attempts = defaultAttempts;
                max = defaultMax;
        }
    }

}
