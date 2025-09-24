package Week3;
import java.util.Scanner;

public class eg_driving_cost {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double mpg;
        double price;
        double miles;

        System.out.print("Enter mpg: ");
        mpg = input.nextDouble();

        System.out.println("Enter price: ");
        price = input.nextDouble();

        miles = 10;
        System.out.printf("Cost for 50 miles: %.2f\n", drivingCost(mpg, price, miles));

        miles = 50;
        System.out.printf("Cost for 50 miles: %.2f\n", drivingCost(mpg, price, miles));

        miles = 400;
        System.out.printf("Cost for 50 miles: %.2f\n", drivingCost(mpg, price, miles));


    }
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven)
    {
        double dollarCost = (milesDriven * dollarsPerGallon) / (milesPerGallon);
        return dollarCost;
    }
}
