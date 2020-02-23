package feb_23;

import java.util.Scanner;

public class NumberGuess {
    public static void guessNumber(int number){
        Scanner input = new Scanner(System.in);
        int userGuess = 0;
        while(userGuess != number){
            System.out.print("Guess the number: ");
            userGuess = input.nextInt();
            if(userGuess == number){
                System.out.println("CONGRATS!");
            }
            else if(userGuess > number){
                System.out.println("Try smaller number");
            }
            else{
                System.out.println("Try larger number");
            }
        }
    }
}