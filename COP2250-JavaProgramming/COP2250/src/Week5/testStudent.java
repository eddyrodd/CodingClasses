package Week5;
import java.util.Scanner;
//driver class
public class testStudent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String major;

        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Major: ");
        major = input.nextLine();

        Student st1 = new Student( name, age, major);

        System.out.println(st1);


    }


}
