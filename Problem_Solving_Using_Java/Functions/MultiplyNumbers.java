package Functions;

import java.util.Scanner;

public class MultiplyNumbers {
    
    public static int multiply(int a, int b) {
        return a*b;
    }
 
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a : " + a );
        System.out.println("b : " + b );

        int result = multiply(a, b);
        System.out.println("Product :" + result);

    }
}
