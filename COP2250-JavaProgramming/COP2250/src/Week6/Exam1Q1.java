package Week6;
import java.util.*;
import java.lang.Math;

/*
Exam1Q1

public class Exam1Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Hello Bye-bye:");
        String word = input.next();
        String sentence = input.nextLine();
        System.out.println("Using next(): " + word);
        System.out.println("Using nextLine(): " + sentence);
    }
}

-----------------------------------
Question:
What is the difference between scnr.nextLine() and scnr.next()?
What would be input using each of these 2 methods if the input is: "Hello Bye-bye"
*/

public class Exam1Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type Hello Bye-bye:");
        String nextExample = input.next();          // reads "Hello"
        String restOfLine = input.nextLine();       // reads " Bye-bye"
        String nextLineExample = nextExample + restOfLine; // combine them

        // Echo input back
        System.out.println(nextLineExample);

        System.out.println("Using next: " + nextExample);
        System.out.println("Using nextLine: " + nextLineExample);

    }
}












