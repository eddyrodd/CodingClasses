package Week3;
import java.util.Scanner;

public class eg_scope {
    public static void main(String [] args) {
        int a = 2;
        int b = 3;
        {
            //int b = 3;
            int sum = a + b;
            System.out.println("Sum: " + sum);
        }
    }
}
