package march_2;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][3];
        int counter = 1;
        for(int i = 0; i < arrayInt.length; i++){
            for(int j = 0; j < arrayInt[i].length; j++){
                arrayInt[i][j] = counter;
                counter++;
            }
        }
        for(int i = 0; i < arrayInt.length; i++){
            for(int number : arrayInt[i]){
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}