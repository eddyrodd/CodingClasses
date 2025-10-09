package Week7;
import java.util.*;

public class smallestNumberExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Ask user for three numbers
        System.out.print("Enter three numbers separated by spaces: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        // Find the smallest value
        double smallest = Math.min(n1, Math.min(n2, n3));

        // Determine which numbers are smallest
        if (n1 == smallest && n2 == smallest && n3 == smallest) {
            System.out.println("All three numbers are equal and smallest.");
        }
        else if (n1 == smallest && n2 == smallest) {
            System.out.println("n1 and n2 are the smallest.");
        }
        else if (n1 == smallest && n3 == smallest) {
            System.out.println("n1 and n3 are the smallest.");
        }
        else if (n2 == smallest && n3 == smallest) {
            System.out.println("n2 and n3 are the smallest.");
        }
        else if (n1 == smallest) {
            System.out.println("n1 is the smallest.");
        }
        else if (n2 == smallest) {
            System.out.println("n2 is the smallest.");
        }
        else {
            System.out.println("n3 is the smallest.");
        }
    }
}