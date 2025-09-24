package Week5;
import java.util.Scanner;

public class testPet {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String color;
    String name;
    int age;

        System.out.println("Enter pet color: ");
        color = input.nextLine();
        System.out.println("Enter pet name: ");
        name = input.nextLine();
        System.out.println("Enter pet age: ");
        age = input.nextInt();

        Pet pet1 = new Pet(color, name, age);
        System.out.println(pet1);


    }
}
