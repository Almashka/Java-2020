package JavaReview;

public class Test {
    static int add(int a, int b){
        return a + b;
    }
    private static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Test.add(32,45));
        System.out.println(Test.add(12.09, 6.89));
    }
}
