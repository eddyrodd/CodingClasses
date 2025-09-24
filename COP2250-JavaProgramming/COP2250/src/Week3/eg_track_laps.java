package Week3;
import java.util.Scanner;

public class eg_track_laps {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        double laps;

        System.out.println("Laps: ");
        laps = input.nextDouble();
        System.out.printf("Miles ran: %.2f\n", lapsToMiles(laps));

    }

    public static double lapsToMiles(double num1)
    {
        return (num1 / 4);
    }
}
