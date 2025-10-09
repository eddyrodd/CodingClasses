package Week7;
import java.util.*;

public class customerTotalCostExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemsPurchased, totalCost;
        System.out.print("Enter items purchased: ");
        itemsPurchased = input.nextDouble();
        System.out.print("Enter total cost: ");
        totalCost = input.nextDouble();

        if (itemsPurchased >=10) {
            System.out.println("You're eligible or a discount!");
            if (totalCost >= 100){
                System.out.println("You've received a 20% discount!");
            }
            else if (totalCost >= 50) {
                System.out.println("You've received a 10% discount!");
            }
            else {
                System.out.println("You've received a 5% discount!");
            }
        }
        else {
            System.out.println("You are ineligible for a discount.");
        }
    }
}
