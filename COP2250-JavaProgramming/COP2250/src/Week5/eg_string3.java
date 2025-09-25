package Week5;

public class eg_string3 {
    public static void main(String[] args) {
        String a = "florida";
        String b = " HELLO";

        System.out.println(a + b);
        System.out.println(a.concat(b));
        System.out.println(a.replace('f', 'F'));
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.trim());
    }
}
