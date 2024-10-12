package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void fibo (int n){
        if (n < 0){
            System.out.println("Invalid value!");
        }
        else{
            int a = 0, b = 1;
            System.out.print("Fibonacci series of " + n + " numbers: \n" + a + " ");
        
            if(n > 1) {
                //find nth term
                for(int i=2; i<=n; i++) {
                    System.out.print(b+" ");
                    //the concept below is called swapping
                    int temp = b;
                    b = a + b;
                    a = temp;
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }   
}
