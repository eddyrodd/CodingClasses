package Week9;

public class FourExamplesExercise {
    public static void main(String[] args) {

        // First One (Starts with 1, ends with 7)
        for (int row = 1; row <= 7; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second one (Starts with 7, ends with 1)
        for (int row = 7; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Third one (Starts with 7, ends with 1 REVERSED)


        //Fourth one (Starts with 1, ends with 7 REVERSED)
        for (int row = 1; row <= 7; row++) {
            for (int space = 7; space > row; space--) {
            System.out.print(" ");
        }
            for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
