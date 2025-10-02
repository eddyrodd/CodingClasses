import java.util.*;
import static java.lang.Math.*;

/*
Question:
Write the code for a method called exponentialValue which calculates the base variable
being raised to the power of the exponent variable. After, the method returns the calculated value.
*/


public static double exponentialValue(double variable, double expVariable) {
    return pow(variable, expVariable);
}

void main() {
    System.out.println(exponentialValue(2,3));
}