package feb_9;

import java.util.Scanner;

public class Skills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your skill set (Java/SQL/Cloud):");
        String answer = input.next();
        if(answer.equalsIgnoreCase("Java")){
            System.out.print("Type your Java score: ");
            int javaScore = input.nextInt();
        }
        else if(answer.equalsIgnoreCase("SQL")){
            System.out.print("Type your Hackerrank score: ");
            int sqlScore = input.nextInt();
        }
        else if(answer.equalsIgnoreCase("Cloud")){
            System.out.print("Do you have a certification? ");
             String score = input.nextLine();
        }
        else{
            System.out.println("Only Java/SQL/Cloud");
        }
    }
}
