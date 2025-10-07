package Week7;
import java.util.*;

public class ifElseRadiusExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius, area;
        radius = input.nextInt();
        area = radius * radius * Math.PI;

        if (radius >= 0)
        {
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
