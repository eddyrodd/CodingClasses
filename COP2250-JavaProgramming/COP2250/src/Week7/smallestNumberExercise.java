package Week7;
import java.util.*;

public class smallestNumberExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter n1: ");
        n1 = input.nextInt();
        System.out.print("Enter n2: ");
        n2 = input.nextInt();
        System.out.print("Enter n3: ");
        n3 = input.nextInt();

        if (n1 <= n2 && n1<= n3)
        {
            System.out.println("n1 is the smallest");
        }
        else if (n2 <=n1 && n2 <= n3)
        {
            System.out.println("n2 is the smallest");
        }
        else
        {
            System.out.println("n3 is the smallest");
        }

    }
}
