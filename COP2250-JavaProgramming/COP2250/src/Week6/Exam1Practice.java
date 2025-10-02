package Week6;
/*
==============================
Java Exam Practice Questions
==============================
Each question is in its own class.
Comment/uncomment the class you want to run in IntelliJ.
*/

// ==============================
// Question 1
// ==============================
/*
Question 1:
What is the difference between scnr.nextLine() and scnr.next()?
What would be input using each of these 2 methods if the input is: "Hello Bye-bye"
*/
import java.util.*;
import java.lang.Math.*;

public class Exam1Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // needed for input.next and input.nextLine

        System.out.println("Type Hello Bye-bye:");
        String word = input.next();      // reads just the first token before space
        String sentence = input.nextLine(); // reads the remainder of the line

        System.out.println("Using next(): " + word);
        System.out.println("Using nextLine(): " + sentence);

        // The difference: next() reads one word (stops at whitespace).
        // nextLine() reads the whole line (including spaces) until newline.
    }
}

// ==============================
// Question 2
// ==============================
/*
Question 2:
Write an example of using the Math.sqrt method, the Math.pow method, and Math.PI.
*/
/*
    public static void main(String[] args) {
        double diag = Math.sqrt(3*3 + 4*4);        // sqrt example
        double cube = Math.pow(8, 3);              // pow example
        double circleArea = Math.PI * Math.pow(5, 2); // PI example

        System.out.println("Diagonal: " + diag);
        System.out.println("Cube: " + cube);
        System.out.println("Circle area: " + circleArea);
    }


// ==============================
// Question 3
// ==============================
/*
Question 3:
What is the value in 'answer' after executing the following statements:

int num1 = 3;
int num2 = 2;
int num3 = 8;
int num4 = 5;
int answer = num1 + num3 / num2 * num4;
*/
/*
    public static void main(String[] args) {
        int num1 = 3, num2 = 2, num3 = 8, num4 = 5;
        int answer = num1 + num3 / num2 * num4;

        System.out.println("Answer: " + answer); // expected 23
    }


// ==============================
// Question 4
// ==============================
/*
Question 4:
The volume and area of a cylinder are calculated as:
  Volume = pi r^2 h
  Surface Area = 2 pi r^2 + 2 pi r h

Write the java class name VolumeAndArea.
From the user, get the radius and height of a cylinder as floating-point (double) numbers,
and output the volume and area of the cylinder.
Hint: Use Math.pow and Math.PI in your calculations.
Output each floating-point value with two digits after the decimal point.
Write appropriate comments.
Complete the same problem using a separate method to pass radius and height values.
*/

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = Math.PI * Math.pow(r, 2) * h;
        double area = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;

        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Surface Area: %.2f%n", area);

        // Using methods
        System.out.printf("Volume (method): %.2f%n", volume(r, h));
        System.out.printf("Surface Area (method): %.2f%n", surfaceArea(r, h));
    }

    static double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    static double surfaceArea(double r, double h) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }


// ==============================
// Question 5
// ==============================
/*
Question 5:
Write a code to return the substring from after the index of the first 'a' to the end of the string.
*/


/*
    public static String afterA(String s) {
        int i = s.indexOf('a');
        return (i == -1) ? "" : s.substring(i + 1);
    }

    public static void main(String[] args) {
        System.out.println(afterA("Banana")); // expected "nana"
    }


// ==============================
// Question 6
// ==============================
/*
Question 6:
Declare a String variable named miamiFlorida with the initial value of "South Beaches".
- Print the second to last character in miamiFlorida.
- Print the location of the second occurrence of the letter 'e' in miamiFlorida.
- Print the initials of the two words together.
*/


/*
    public static void main(String[] args) {
        String miamiFlorida = "South Beaches";

        char secondToLast = miamiFlorida.charAt(miamiFlorida.length() - 2);
        int firstE = miamiFlorida.indexOf('e');
        int secondE = miamiFlorida.indexOf('e', firstE + 1);
        String initials = "" + miamiFlorida.charAt(0) +
                miamiFlorida.split(" ")[1].charAt(0);

        System.out.println("Second to last char: " + secondToLast);
        System.out.println("Second 'e' index: " + secondE);
        System.out.println("Initials: " + initials);
    }


// ==============================
// Question 7
// ==============================
/*
Question 7:
Write the code for a method called exponentialValue which calculates the base variable
being raised to the power of the exponent variable. After, the method returns the calculated value.
Be sure to write the method header as well as the body of the method.
*/


/*
    public static double exponentialValue(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponentialValue(2, 3)); // expected 8
    }


// ==============================
// Question 8
// ==============================
/*
Question 8:
Write a Shoes domain class that will contain the brand of the shoe, the year released, and the color.
Then, in the driver class, you will create a shoe as the user. Finally, manipulate the domain class
in order to print all the details pertaining to the shoe created by the user.
*/


/*
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

*/