package Loops;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int input;


        do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("This is Excellent.");
            } 
            else if(marks >= 60 && marks <= 89) {
                System.out.println("This is Good.");
            } 
            else if(marks >= 0 && marks <= 59) {
                System.out.println("Can do better.");
            } 
            else {
               System.out.println("Invalid");
            }

            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();
      
        } 
        while(input == 1);

    }
}
