public class Hangman {

    private String secretWord;
    private String usersGuess;


    public Hangman() {

        int randomNumber = (int) (Math.random() * 5) + 1;


        if (randomNumber == 1) {
            secretWord = "java";
        }
        else if (randomNumber == 2) {
            secretWord = "loops";
        }
        else if (randomNumber == 3) {
            secretWord = "method";
        }
        else if (randomNumber == 4) {
            secretWord = "object";
        }
        else { // randomNumber == 5
            secretWord = "array";
        }

        String temp = "";
        for (int i = 0; i < secretWord.length(); i++) {
            char c = secretWord.charAt(i);
            if (c == ' ') {
                temp = temp + " ";
            }
            else {
                temp = temp + "_";
            }
        }
        usersGuess = temp;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public String getUsersGuess() {
        return usersGuess;
    }

    public void setUsersGuess(String usersGuess) {
        this.usersGuess = usersGuess;
    }

    public String toString() {
        return "Secret word: " + secretWord + ", Current guess: " + usersGuess;
    }
}