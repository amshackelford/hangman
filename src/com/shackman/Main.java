package com.shackman;

/* This class contains main method, user can enter a word as args to have others guess,
 * otherwise a random word will be used from WordBank.
 */

public class Main {

    public static void main(String[] args) {
        // Your incredible code goes here...
        if (args.length == 0) {
            Game game = new Game(WordBank.getRandomWord());
            startGame(game);
        } else {
            Game game = new Game(args[0]);
            startGame(game);
        }
    }

    public static void startGame(Game game) {
        Prompter prompter = new Prompter(game);
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }
}
