package feb_24;

public class Substring {
    public static void printInterval(String text, int start, int end){
        for(int i = start; i <= end; i++){
            System.out.print(text.charAt(i));
        }
    }
}