package Week6;
import java.util.*;
import java.lang.Math;

/*
Exam1Q8

public class Exam1Q8 {
    static class Shoes {
        private String brand;
        private int yearReleased;
        private String color;

        public Shoes(String brand, int yearReleased, String color) {
            this.brand = brand;
            this.yearReleased = yearReleased;
            this.color = color;
        }

        public String toString() {
            return brand + " (" + yearReleased + "), Color: " + color;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shoe brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter release year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter shoe color: ");
        String color = sc.nextLine();

        Shoes shoe = new Shoes(brand, year, color);
        System.out.println("Shoe details: " + shoe);
    }
}

-----------------------------------
Question:
Write a Shoes domain class that will contain the brand of the shoe, the year released, and the color.
Then, in the driver class, you will create a shoe as the user. Finally, manipulate the domain class
in order to print all the details pertaining to the shoe created by the user.
*/
