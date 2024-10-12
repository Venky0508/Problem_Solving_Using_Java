package Functions;

import java.util.Scanner;

public class GreaterNum {
    public static int getGreater(int a, int b) {
        if(a > b) {
            return a;
        } 
        else {
            return b;
        }
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number between " + a + " and " + b + " is :" );
        System.out.println(getGreater(a, b));
    }   
}
