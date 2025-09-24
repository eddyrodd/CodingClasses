package Week3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2;

        System.out.print("Enter number 1: ");
        n1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        n2 = input.nextDouble();

        System.out.println("Addition is: " + addMethod(n1, n2));

        System.out.println("Subtraction is: " + subMethod(n1, n2));

        System.out.println("Multiplication is: " + multMethod(n1, n2));

        System.out.println("Division is: " + divMethod(n1, n2));


    }

    public static double addMethod(double num1, double num2)
    {
       return num1 + num2;
    }

    public static double subMethod(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multMethod(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double divMethod(double num1, double num2)
    {
        return num1 / num2;
    }

}
