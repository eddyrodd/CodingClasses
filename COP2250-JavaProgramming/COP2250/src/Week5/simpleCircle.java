package Week5;
import java.util.Scanner;

//Domain Class
public class simpleCircle {
   protected double radius;

    simpleCircle() // zero arg constructor
    {
        radius = 50;
    }

    simpleCircle(double newRadius) // one arg constructor
    {
        radius = newRadius;
    }

    double getArea()
    {
        return radius * radius * Math.PI;
    }

    double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }
}
