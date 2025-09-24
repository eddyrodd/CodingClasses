package Week2;
import java.util.Scanner;

public class eg2_input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        //name = keyboard.next();

        System.out.printf("Name: %s", name);

    }
}
