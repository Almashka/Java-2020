package march_2;

public class Random2DimArray {
    public static void main(String[] args) {
        int arrayNumbers[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        for(int i = 0; i < arrayNumbers.length; i++){
            for(int j = 0; j < arrayNumbers[i].length; j++){
                arrayNumbers[i][j] = (int)(Math.random() * 1000);
            }
        }
        for(int numberArray[] : arrayNumbers){
            for(int number : numberArray){
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}