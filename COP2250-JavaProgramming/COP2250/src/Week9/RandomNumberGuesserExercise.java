package Week9;
import java.util.*;

public class RandomNumberGuesserExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber, userGuess, counter = 0;
        System.out.print("Enter a random number 1-50: ");
        randomNumber = input.nextInt();

        while (randomNumber > 50 || randomNumber < 0) {
            System.out.println("Invalid Input");
            System.out.println("Enter a random number 1-50: ");
            randomNumber = input.nextInt();
        }

        do {
            System.out.print("User 2, guess the random number 1-50: ");
            userGuess = input.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("Too Low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("You got it!");
            }
            counter++;
        }
        while (userGuess != randomNumber);
        System.out.println("It took you " + counter + " tries to get it right.");
    }
}



