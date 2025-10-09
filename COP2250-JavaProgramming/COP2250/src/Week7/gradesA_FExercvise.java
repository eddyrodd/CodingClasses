package Week7;
import java.util.*;

public class gradesA_FExercvise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n;
        n = input.nextDouble();
        if (n <=100 && n>= 90)
        {
            System.out.println("A");
        }
        else if (n < 90 && n >= 80)
        {
            System.out.println("B");
        }
        else if (n < 80 && n >= 70)
        {
            System.out.println("C");
        }
        else if (n < 70 && n >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("Fail");
        }

        }

    }

