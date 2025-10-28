package Week10;
import java.util.*;

public class FlowChartAttempt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String message;

        System.out.print("Enter age: ");
        age = input.nextInt();

        if (age < 16) {
            message = "Too young";
        }
        else if (age <18) {
            message = "You can drive";
        }
        else if (age <=21) {
            message = "You can drive and vote";
        }
        else {
            message = "You can vote drive AND drink";
        }
        System.out.println(message);

    }
}
