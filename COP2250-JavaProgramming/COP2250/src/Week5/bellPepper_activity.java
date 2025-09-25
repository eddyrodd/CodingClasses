package Week5;

public class bellPepper_activity {
    public static void main(String[] argws) {
        String string = "bellPepper";
        int first_e = string.indexOf('e');
        int second_e = string.indexOf('e', first_e + 1);
        int third_e = string.indexOf('e', second_e + 1);
        System.out.println("The location of the third e in bellpepper is: " + third_e);


    }
}
