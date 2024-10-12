package Functions;

import java.util.Scanner;

public class CalcCircumference {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println("The circumference of the circle with radius of " + r + " is " +getCircumference(r));
   }   

}
