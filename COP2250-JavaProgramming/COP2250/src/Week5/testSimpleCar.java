package Week5;
import java.sql.SQLOutput;
import java.util.Scanner;

public class testSimpleCar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int milDrvFrwrd;
        int milDrvBckwrd;
        String hornHonk;
        String carStat;

        hornHonk = ", I honked the horn";
        carStat = " and the car is up and running";

        System.out.println("Enter miles driven forward: ");
        milDrvFrwrd = input.nextInt();
        System.out.println("Enter miles driven backward: ");
        milDrvBckwrd = input.nextInt();


        simpleCar car1 = new simpleCar(milDrvFrwrd, milDrvBckwrd, hornHonk, carStat);
        System.out.println(car1);

    }
}
