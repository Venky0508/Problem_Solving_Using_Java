package Conditionals;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n) {
            case 1 :
                System.out.println("It is Monday");
                break;
            case 2 :
                System.out.println("It is Tuesday");
                break;
            case 3 :
                System.out.println("It is Wednesday");
                break;
            case 4 :
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6 :
                System.out.println("It is Saturday");
                break;
            default :
                System.out.println("It is Sunday");
        }
    }
}
