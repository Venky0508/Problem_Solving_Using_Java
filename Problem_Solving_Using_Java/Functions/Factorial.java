package Functions;

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n) {
       //loop
       if(n < 0) {
           System.out.println("Invalid Number");
           return;
       }
       int factorial = 1;

       for(int i = n; i >= 1; i--) {
           factorial = factorial * i;
       }

       System.out.println(factorial);
       return;
   }
   public static void main(String args[]) {
       @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n + " :");

        printFactorial(n);
   }

}
