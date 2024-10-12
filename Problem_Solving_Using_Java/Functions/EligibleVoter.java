package Functions;

import java.util.Scanner;

public class EligibleVoter {
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (isElligible(age) == true){
            System.out.println("The person with age " +age+ " is eligible to vote.");
        }
        else{
            System.out.println("The person with age " +age+ " is not eligible to vote.");
        }
   }   

}
