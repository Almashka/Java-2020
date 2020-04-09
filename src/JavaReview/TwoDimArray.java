package JavaReview;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}};
        //System.out.println(numbers[1][0]);

        numbers[0][0] = 29;
        /*for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/
        //---------------------------------------------------
        for(int[] oneDim : numbers){
            for(int element : oneDim){
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
