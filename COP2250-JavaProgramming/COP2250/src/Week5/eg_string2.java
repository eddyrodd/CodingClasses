package Week5;

public class eg_string2 {
    public static void main(String[] args) {
        String miamiFlorida = "Beaches";
        int first_e = miamiFlorida.indexOf('e');
        int second_e = miamiFlorida.indexOf('e', first_e + 1);

        System.out.println("The index of first 'e' is: " + first_e);
        System.out.println("Location of second 'e' is: " + second_e);
    }
}
