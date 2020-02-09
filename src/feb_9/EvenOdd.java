package feb_9;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 19;
        String output = (number % 2 == 0)? "even number" : "odd number";
        System.out.println(output);
    }
}