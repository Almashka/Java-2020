package Feb_9;

import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        Scanner typeAnswer = new Scanner(System.in);
        System.out.println("Are you subscribed (Y/N)?");
        String answer = typeAnswer.next();

        if(answer.equalsIgnoreCase("Y")){
            System.out.println("Enter your usage please (1-100):");
            int usage = typeAnswer.nextInt();
            if(usage < 101){
                System.out.println("$10");
            }
            else{
                System.out.println("$40" +
                        "");
            }
        }
        else{
            System.out.println("Please subscribe");
        }
    }
}
