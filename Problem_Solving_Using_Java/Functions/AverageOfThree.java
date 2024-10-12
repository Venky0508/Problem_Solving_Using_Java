package Functions;

import java.util.Scanner;

public class AverageOfThree {
    public static void average(int a, int b, int c){
        int average = (a + b + c) / 3;
        System.out.println(average);

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of " + a + ", " + b + ", " + c + " is :" );
        average(a, b, c);
    }
}
