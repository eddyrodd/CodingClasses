package Week9;

public class Example6Exercise {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i); // only print number if not divisible by 3 or 5
            }
        }
    }
}