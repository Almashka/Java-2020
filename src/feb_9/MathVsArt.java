package feb_9;

import java.util.Scanner;

public class MathVsArt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Math or Art?");
        String choice = input.next();
        if(choice.equalsIgnoreCase("math")){
            System.out.println("Need tutor? (Y/N) ");
            String tutor = input.next();
            if(tutor.equalsIgnoreCase("y")){
                System.out.println("OK");
            }
            else if(tutor.equalsIgnoreCase("n")){
                System.out.println("Study yourself");
            }
            else{
                System.out.println("Please type y or n.");
            }
        }
        else if(choice.equalsIgnoreCase("art")){
            System.out.println("Nice choice");
        }
        else{
            System.out.println("Please choose only math or art.");
        }
    }
}
