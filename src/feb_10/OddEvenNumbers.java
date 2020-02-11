package feb_10;

public class OddEvenNumbers {
    public static void main(String[] args) {
        for(int i = 100; i >= 0; i--){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
       for(int i = 2001; i >= 1000; i--){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}