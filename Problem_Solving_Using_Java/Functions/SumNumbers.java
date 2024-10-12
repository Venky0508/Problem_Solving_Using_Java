package Functions;

import java.util.Scanner;

public class SumNumbers {
    
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
   
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a : " + a );
        System.out.println("b : " + b );
        sum(a, b); // Function Call
 
    }
 
}
