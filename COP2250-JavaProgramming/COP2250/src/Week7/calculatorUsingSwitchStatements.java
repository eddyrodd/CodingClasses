package Week7;
import java.util.Scanner;

public class calculatorUsingSwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, operation;
        System.out.println(" Type 1 for Addition \n Type 2 for Subtraction \n Type 3 for Multiplication \n Type 4 for Division");
        operation = input.nextInt();
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        switch (operation) {
            case 1: System.out.println("The addition of n1 and n2 is: " + (n1 + n2)); break;
            case 2: System.out.println("The subtraction of n1 and n2 is: " + (n1 - n2)); break;
            case 3: System.out.println("The multiplication of n1 and n2 is: " + (n1 * n2)); break;
            case 4: System.out.println("The division of n1 and n2 is: " + (n1 / n2)); break;
        }
    }
}
