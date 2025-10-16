package Week8;
import java.util.*;

public class TenStudentsQuizExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade;
        double average;

        for (int count = 1; count <=10; count++){
            System.out.println("Enter a grade:");
            grade = input.nextInt();
            total = total + grade;
            average = (double)total/10;
            System.out.println("Total of all 10 grades is " + total);
            System.out.println("Class average is " + average);

        }    }
}
