package Week2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class eg_name {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");

        name = input.nextLine();

        System.out.println("Name: " + name);

        System.out.printf("%nName: %s", name);

    }
}
