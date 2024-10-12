package Functions;

import java.util.Scanner;

public class ComputeGCD {
    public static void gcd(int n1, int n2){
        while(n1 != n2) { 
            if(n1 > n2) {
               n1 = n1 - n2;
            } 
            else {
               n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
   }   
}
