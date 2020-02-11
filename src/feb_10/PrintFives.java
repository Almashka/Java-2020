package feb_10;

import java.util.Scanner;

public class PrintFives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a starting number: ");
        int start = input.nextInt();
        System.out.print("Please type an ending number: ");
        int end = input.nextInt();

        if(start < end){
            for(int i = start; i <= end; i = i + 5){
                System.out.println(i);
            }
        }
        else{
            for(int i = start; i >= end; i = i - 5){
                System.out.println(i);
            }
        }
    }
}