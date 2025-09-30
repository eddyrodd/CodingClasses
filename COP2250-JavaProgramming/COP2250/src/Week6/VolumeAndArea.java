package Week6;
import java.util.*;
import static java.lang.Math.*;

public class VolumeAndArea {
    public static void main(String[] args) {
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
        System.out.printf("\n Area is: %.2f", area);







    }



}
