package Week7;
import java.util.*;
import static java.lang.Math.*;

public class eg1IfElseStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int score = input.nextInt();

        if (score >= 60)
        //true block
        {
            System.out.println("Pass");
            System.out.println("Good");
        }
        else
        //false block
        {
            System.out.println("Fail");
            System.out.println("Bad");
        }



    }


}
