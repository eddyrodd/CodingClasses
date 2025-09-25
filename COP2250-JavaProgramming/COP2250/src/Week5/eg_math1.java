package Week5;
import java.util.Scanner;
import static java.lang.Math.*;

public class eg_math1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,y;

        System.out.print("Enter number 1: ");
        x = input.nextDouble();
        System.out.print("Enter number 2: ");
        y = input.nextDouble();

        double maxVal, minVal, sqrtVal, powVal;

        maxVal = max(x,y);
        System.out.println("Max value is: " + maxVal);

        minVal = min(x,y);
        System.out.println("Minimum value is: " + minVal);

        sqrtVal = sqrt(x);
        System.out.println("The sqrt of first number is: " + sqrtVal);
        sqrtVal = sqrt(y);
        System.out.println("The sqrt of second number is: " + sqrtVal);

        powVal = pow(x,y);
        System.out.println("x power y is: " + powVal);
    }
}
