package feb_9;

public class NestedIf {
    public static void main(String[] args) {
        int x = 1, y = -4;
        if(x == 1){
            System.out.println("OK");
            if(x > 0){
                System.out.println("Hello");
            }
            System.out.println("OK OK");
        }
    }
}