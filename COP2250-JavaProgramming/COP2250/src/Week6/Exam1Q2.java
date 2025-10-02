import java.util.*;
import java.lang.Math;

/*
Exam1Q2

public class Exam1Q2 {
    public static void main(String[] args) {
        double diag = Math.sqrt(3*3 + 4*4);
        double cube = Math.pow(8, 3);
        double circleArea = Math.PI * Math.pow(5, 2);

        System.out.println("Diagonal: " + diag);
        System.out.println("Cube: " + cube);
        System.out.println("Circle area: " + circleArea);
    }
}

-----------------------------------
Question:
Write an example of using the Math.sqrt method, the Math.pow method, and Math.PI.
*/

public static void main(String[] args){
    double sqrtExample, powExample, PIExample;

    sqrtExample = Math.sqrt(5.0);
    System.out.println("Sqrt of 5: " + sqrtExample);

    powExample = Math.pow(4, 3);
    System.out.println("4 to pwr of 3: " + powExample);

    PIExample = Math.PI;
    System.out.println("Math.PI: " + PIExample);
}