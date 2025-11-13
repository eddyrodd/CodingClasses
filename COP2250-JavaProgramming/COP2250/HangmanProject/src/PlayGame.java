import javax.swing.JOptionPane;

public class PlayGame {

    private static int totalWins = 0;
    private static int totalLosses = 0;

    public static void main(String[] args) {

        boolean playAgain;

        do {
            Hangman aGame = new Hangman();

            processGuesses(aGame);

            determineWinner(aGame);

            int answer = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to play again?",
                    "Play Again?",
                    JOptionPane.YES_NO_OPTION
            );

            if (answer == JOptionPane.YES_OPTION) {
                playAgain = true;
            } else {
                playAgain = false;
            }

        } while (playAgain);

        summarize();

        System.exit(0);
    }


    public static void processGuesses(Hangman aGame) {

        String secretWord = aGame.getSecretWord();
        String usersGuess = aGame.getUsersGuess();

        int numLetters = 0;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) != ' ') {
                numLetters++;
            }
        }

        int maxTries = 3 * numLetters;
        int triesUsed = 0;

        while (triesUsed < maxTries && !secretWord.equalsIgnoreCase(usersGuess)) {

            String message = "Current word: " + usersGuess +
                    "\nTries left: " + (maxTries - triesUsed) +
                    "\n\nGuess a letter:";

            String guessInput = JOptionPane.showInputDialog(null, message, "Hangman - Guess a Letter", JOptionPane.QUESTION_MESSAGE);

            if (guessInput == null) {
                guessInput = "";
            }

            while (guessInput.length() == 0) {
                guessInput = JOptionPane.showInputDialog(
                        null,
                        "Please enter at least one character:\n\nCurrent word: " + usersGuess,
                        "Hangman - Guess a Letter",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (guessInput == null) {
                    guessInput = "";
                }
            }

            char guessedLetter = guessInput.charAt(0);

            String lowerSecret = secretWord.toLowerCase();
            char lowerGuess = Character.toLowerCase(guessedLetter);

            String newUsersGuess = usersGuess;
            int index = lowerSecret.indexOf(lowerGuess);
            boolean found = false;

            while (index != -1) {
                found = true;

                newUsersGuess = newUsersGuess.substring(0, index)
                        + secretWord.charAt(index)
                        + newUsersGuess.substring(index + 1);

                index = lowerSecret.indexOf(lowerGuess, index + 1);
            }

            if (found) {
                JOptionPane.showMessageDialog(
                        null,
                        "Good guess!",
                        "Hangman",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "That letter is not in the word.",
                        "Hangman",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            usersGuess = newUsersGuess;
            aGame.setUsersGuess(usersGuess);

            triesUsed++;
        }

        if (!secretWord.equalsIgnoreCase(usersGuess)) {
            String finalMessage = "You are out of letter guesses.\n" +
                    "Current pattern: " + usersGuess +
                    "\n\nFinal chance: Guess the entire word:";

            String finalGuess = JOptionPane.showInputDialog(
                    null,
                    finalMessage,
                    "Hangman - Final Guess",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (finalGuess == null) {
                finalGuess = "";
            }

            aGame.setUsersGuess(finalGuess);
        }
    }


    public static void determineWinner(Hangman aGame) {
        String secretWord = aGame.getSecretWord();
        String usersGuess = aGame.getUsersGuess();

        if (secretWord.equalsIgnoreCase(usersGuess)) {
            JOptionPane.showMessageDialog(
                    null,
                    "You guessed the word: " + secretWord,
                    "Hangman - You Win!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            totalWins++;
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "You did not guess the word.\nThe secret word was: " + secretWord,
                    "Hangman - You Lose",
                    JOptionPane.INFORMATION_MESSAGE
            );
            totalLosses++;
        }
    }


    public static void summarize() {
        String summary = "===== GAME SUMMARY =====\n" +
                "Games won:   " + totalWins + "\n" +
                "Games lost:  " + totalLosses + "\n" +
                "========================";

        JOptionPane.showMessageDialog(
                null,
                summary,
                "Hangman Summary",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}