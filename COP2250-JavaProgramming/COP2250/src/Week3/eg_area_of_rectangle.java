package Week3;
import java.util.Scanner;

public class eg_area_of_rectangle {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double length, width;

        System.out.print("Length of triangle: ");
        length = input.nextDouble();
        System.out.print("Width of triangle: ");
        width = input.nextDouble();

        System.out.println("Perimeter: " + perimeterMethod(length, width));
        System.out.println("Area : " + areaMethod(length, width));

    }

    public static double perimeterMethod(double num1, double num2)
    {
        return (2 * num1) + (2 * num2);
    }

    public static double areaMethod(double num1, double num2)
    {
        return (num1 * num2);
    }
}
