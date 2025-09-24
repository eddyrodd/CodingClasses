package Week2;
import java.util.Scanner;

public class eg_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n1, n2, avg;

        System.out.print("Enter number 1: ");
        n1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        n2 = input.nextDouble();
        avg = (n1 + n2) / 2;
        System.out.print("Average = " + avg);



    }
}
