package feb_23;

public class Problems {
    public static void printNum(){
        //Method to print from 100 to 1000
        int start = 100;
        while(start <= 1000){
            System.out.println(start);
            start++;
        }
    }
    //Method to print all ASCII values & characters
    public static void printASCII(){
        for(int i = 0; i < 256; i++){
            System.out.println("Number: " + i + " Character: " + (char)i);
        }
    }
}