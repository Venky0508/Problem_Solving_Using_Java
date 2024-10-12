package Functions;

import java.util.Scanner;

public class OddNumSum {
    public static void printSum(int n) {
        int sum = 0;

        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of all odd numbers between 1 to " + n + " is :  " + sum);
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
   }   

}
