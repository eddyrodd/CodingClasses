package Week9;
import java.util.*;

public class AsteriskAndNumberLoop {
    public static void main(String[] args) {
        int row;
        int column;
        int num;
        int num2;

        for (row = 1; row <= 7; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (num = 1; num <= 5; num++) {
            for (num2 =1; num2 <= num; num2++) {
                System.out.print(num2 + " ");
            }
            System.out.println();
        }
    }
}


