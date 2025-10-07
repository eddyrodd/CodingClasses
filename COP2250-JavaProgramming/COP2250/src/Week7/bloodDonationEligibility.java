package Week7;
import java.util.*;

public class bloodDonationEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age, weight;
        System.out.print("Enter age: ");
        age = input.nextDouble();
        System.out.print("Enter weight: ");
        weight = input.nextDouble();

        if (age >= 18 && weight>= 100) {
            System.out.println("You are eligible to donate blood.");
        }
        else if (age >= 18 && weight <= 100) {
            System.out.println("You are not eligible because you do not weigh 100 pounds or more");
        }
        else if (age <= 18 && weight >= 100) {
            System.out.println("You are not eligible because you are not 18 years old or older");
        }
        else if (age <= 18 && weight <= 100) {
            System.out.println("You are not eligible because you are not 18 years old or older and you do not weight 100 pounds or more");
        }


    }
}
