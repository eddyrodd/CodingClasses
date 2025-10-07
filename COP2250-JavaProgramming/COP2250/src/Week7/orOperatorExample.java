package Week7;

import java.util.Scanner;

public class orOperatorExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n;
        n = input.nextDouble();

        if (n != 0)
        {
            System.out.println("N is not zero");
        }
        else
        {
            System.out.println("N is zero");
        }
    }
}
