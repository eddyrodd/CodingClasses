package Week5;
import java.util.Scanner;

//Driver class
public class testSimpleCircle {
    public static void main(String[] args){
        simpleCircle obj1 = new simpleCircle();
        System.out.println("Area of circle: " + obj1.getArea());

        simpleCircle obj2 = new simpleCircle(30);
        System.out.println("Area of circle with new radius: " + obj2.getArea());

        simpleCircle obj3 = new simpleCircle();
        System.out.println("Perimeter = " + obj3.getPerimeter());
    }

}
