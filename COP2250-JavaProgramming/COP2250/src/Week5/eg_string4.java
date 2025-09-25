package Week5;

public class eg_string4 {
    // code to convert any specific character to upper/lower case
    public static void main(String[] args) {
        String input = "hello world";

        int index = 0; // Let's say we want to convert the character at index 0 to uppercase

        StringBuilder sb = new StringBuilder(input);

        char upperCaseChar = Character.toUpperCase(sb.charAt(index));

        sb.setCharAt(index, upperCaseChar);
        String result = sb.toString();

        System.out.println("Original string: " + input);
        System.out.println("Modified string: " + result);
    }
}

