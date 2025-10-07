package Week7;
import java.util.*;

public class evenOrOddExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 7 == 0)
        {
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");
        }
    }
}
