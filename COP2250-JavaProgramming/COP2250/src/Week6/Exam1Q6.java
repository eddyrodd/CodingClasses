/*
import java.util.*;
import java.lang.Math;

/*
Exam1Q6

public class Exam1Q6 {
    public static void main(String[] args) {
        String miamiFlorida = "South Beaches";
        char secondToLast = miamiFlorida.charAt(miamiFlorida.length() - 2);
        int firstE = miamiFlorida.indexOf('e');
        int secondE = miamiFlorida.indexOf('e', firstE + 1);
        String initials = "" + miamiFlorida.charAt(0) + miamiFlorida.split(" ")[1].charAt(0);

        System.out.println("Second to last char: " + secondToLast);
        System.out.println("Second 'e' index: " + secondE);
        System.out.println("Initials: " + initials);
    }
}
*/
/*
-----------------------------------
Question:
Declare a String variable named miamiFlorida with the initial value of "South Beaches".
- Print the second to last character in miamiFlorida.
- Print the location of the second occurrence of the letter 'e' in miamiFlorida.
- Print the initials of the two words together.
*/

/*
public static void main(String[] args) {
    String miamiFlorida = "South Beaches";
    int length = miamiFlorida.length();
    System.out.println(miamiFlorida.charAt(length - 2));

    int firstE = miamiFlorida.indexOf('e');
    int secondE = miamiFlorida.indexOf('e', firstE + 1);
    System.out.println(secondE);

    char firstInit = miamiFlorida.charAt(0);
    int space = miamiFlorida.indexOf(" ");
    char secondInit = miamiFlorida.charAt(space + 1);
    System.out.println(firstInit + "" + secondInit);
}
*/
