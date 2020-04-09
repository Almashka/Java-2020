package JavaReview;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 10, -2};
        int sum = 0;

        for(int num : numbers){
            //sum = sum + num;
            sum += num;
        }
        System.out.println("Sum of elements in an array 'numbers' is " + sum);
    }
}
