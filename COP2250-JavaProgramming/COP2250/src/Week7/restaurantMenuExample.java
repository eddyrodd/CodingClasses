package Week7;
import java.util.Scanner;

//enter day and you will show the menu of this specific day
public class restaurantMenuExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day eg. Monday, Tuesday...");
        String day = input.nextLine().toLowerCase().trim();

        switch (day) {
            case "monday" : System.out.println("Fish"); break;
            case "tuesday" : System.out.println("Fries"); break;
            case "wednesday" : System.out.println("Burger"); break;
            case "thursday" : System.out.println("Pizza"); break;
            case "friday" : System.out.println("Sandwich"); break;
            case "saturday" : System.out.println("Spaghetti"); break;
            case "sunday" : System.out.println("Pie"); break;
            default : System.out.println("Invalid entry");

        }
    }
}
