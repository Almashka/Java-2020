package feb_16;

public class NumbersNestedLoops {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}