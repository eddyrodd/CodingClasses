package Week6;
import java.util.*;
import java.lang.Math;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/*
Exam1Q4

public class Exam1Q4 {
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

        System.out.printf("Volume (method): %.2f%n", volume(r, h));
        System.out.printf("Surface Area (method): %.2f%n", surfaceArea(r, h));
    }

    static double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    static double surfaceArea(double r, double h) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }
}

-----------------------------------
Question:
The volume and area of a cylinder are calculated as:
  Volume = pi r^2 h
  Surface Area = 2 pi r^2 + 2 pi r h

Write the java class name VolumeAndArea.
From the user, get the radius and height of a cylinder as floating-point (double) numbers,
and output the volume and area of the cylinder.
Hint: Use Math.pow and Math.PI in your calculations.
Output each floating-point value with two digits after the decimal point.
Complete the same problem using a separate method to pass radius and height values.
*/

public class Exam1Q4{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        double radius;
        double height;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        double volume = PI * (pow(radius, 2) * height);
        double area = 2*PI * pow(radius, 2) + 2*PI * radius * height;

        System.out.printf("\nVolume is: %.2f", volume);
        System.out.printf("\nArea is: %.2f", area);

    }
        }