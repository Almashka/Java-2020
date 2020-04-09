package JavaReview;

public class Compare {
    public static void main(String[] args) {
        int[] grades = {90, 75, 50, 100, 65, 80};
        System.out.println(max(grades));
    }

    public static int max(int[] array){
        int maxGrade = array[0];

        for(int number : array){
            if(number > maxGrade){
                maxGrade = number;
            }
        }
        return maxGrade;
    }
}