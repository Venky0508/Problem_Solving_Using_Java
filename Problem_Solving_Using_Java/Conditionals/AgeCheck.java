package Conditionals;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("This is an adult");
        } 
        else {
            System.out.println("This is not an adult");
        }
    }
}
