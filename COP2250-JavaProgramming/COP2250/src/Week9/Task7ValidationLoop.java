package Week9;

import java.util.Scanner;

public class Task7ValidationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumber;
        System.out.print("Enter a random number 1-10: ");
        userNumber = input.nextInt();

        while (userNumber > 10 || userNumber < 1) {
            System.out.println("Invalid Input");
            System.out.print("Enter a random number 1-10: ");
            userNumber = input.nextInt();
        }
        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is even");
        }
        else{
            System.out.println(userNumber+ " is odd");
        }
    }
}
