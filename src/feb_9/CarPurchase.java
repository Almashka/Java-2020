package feb_9;

import java.util.Scanner;

public class CarPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which model (X/Y)?");
        String model = input.next();

        int MSRP = 0;

        if(model.equals("X")){
            MSRP = 30000;
            System.out.print("Do you want body package? (Y/N) ");
            String body = input.next();
            if(body.equalsIgnoreCase("Y")){
                MSRP = MSRP + 5000;
            }
            System.out.println("Do you want sound system? (Y/N)");
            String sound = input.next();
            if(sound.equalsIgnoreCase("y")){
                MSRP += 3000;
            }
        }
        else if(model.equalsIgnoreCase("Y")){
            MSRP = 35000;
            System.out.print("Do you want an entertainment package? (Y/N) ");
            String ent = input.next();
            if(ent.equalsIgnoreCase("y")){
                MSRP += 8000;
                System.out.println("Safety package? (Y/N)");
                String safety = input.next();
                if(safety.equalsIgnoreCase("y")){
                    MSRP += 4000;
                }
            }
        }
        else{
            System.out.println("Sorry, we have only X & Y.");
        }
        if(MSRP != 0){
            System.out.println("$" + MSRP);
        }
    }
}