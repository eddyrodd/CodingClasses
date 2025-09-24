package Week2;
import java.util.Scanner;

public class BMI_exercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weight,height,bmi;

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        bmi = (weight  * 703)/(height * height);
        System.out.printf("Your bmi is: %.4f", bmi);

    }
}
