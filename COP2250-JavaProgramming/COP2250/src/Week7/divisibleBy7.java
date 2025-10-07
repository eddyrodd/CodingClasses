package Week7;

import java.util.Scanner;

public class divisibleBy7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 7 == 0)
        {
            System.out.println("Your number is divisible by 7");
        }
        else
        {
            System.out.println("Your number is not divisible by 7");
        }
    }
}
