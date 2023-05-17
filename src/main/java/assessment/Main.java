package assessment;

import java.util.InputMismatchException;
import java.util.Scanner;

//    - Create a program that continuously ask a user for two inputs (Whole Numbers ONLY).
//
//            - The two inputs are a numerator and a denominator.
//    Your program should attempt to divide the numerator by the denominator and you MUST handle the exception gracefully as seen in the DEMO.
//
//- Do not just add the throws clause for someone else to handle. Use a TRY Catch!!!
//
//            - Your program should catch it if a user enters 0 as the value for the denominator. For example : 42 / 0.
//    Find and use the correct type of exception in this scenario
//
//- Also chain an additional catch block to your try catch so that you have two catch blocks. The second catch should be for catching a situation whereby a user enters some text or a letter instead of a whole number either for the numerator or denominator
//    Find and use the correct type of exception in this scenario.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Insert a numerator that is a whole number:");
            int numerator = scan.nextInt();
            System.out.println("Insert a denominator that is a whole number:");
            int denominator = scan.nextInt();

            int quotient = numerator / denominator;
            System.out.println(quotient);

        } catch (InputMismatchException invalidType){
            System.out.println("-Answer cannot equal zero, contain letters, or be anything other than an int-");
        }finally {
            System.out.println("-Division completed Successfully!-");
        }
    }
}
