package Week9;
import java.util.*;

public class SimpleTableForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i=1; i<=12; i++){
            System.out.println(num + " x " + i + "=" + num * i);

        }
    }
}
