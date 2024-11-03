package GuessGame;

public class Main {
    public static void main(String[] args){
        Game guessGame = new Game();
        guessGame.changeDifficulty(Difficulties.NORMAL);
        guessGame.start();
    }
}
