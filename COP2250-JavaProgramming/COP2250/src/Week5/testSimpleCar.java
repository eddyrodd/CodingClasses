package Week5;

import java.util.Scanner;

public class testSimpleCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to drive forward: ");
        int forward = input.nextInt();

        System.out.print("Enter miles to drive in reverse: ");
        int reverse = input.nextInt();

        simpleCar car = new simpleCar(forward, reverse);

        System.out.println(car); // uses toString()
    }
}
