package Week8;

import java.util.Scanner;

public class GradeForLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -1;
        int grade;

        for (int counter =1; counter<= 10; counter++){
            System.out.println("Enter a grade:");
            grade = input.nextInt();
            if (grade > max){
                max = grade;
            }
            System.out.println("The highest grade is: " + max);
        }
    }
}
