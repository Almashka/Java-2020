package feb_16;

public class Hex {
    public static void main(String[] args) {
        String number = "124AF353E";
        boolean hex = false;
        for(int i = 0; i < 9; i++){
            if(number.charAt(i) == 'A' || number.charAt(i) == 'B' || number.charAt(i) == 'C' || number.charAt(i) == 'D' || number.charAt(i) == 'E' || number.charAt(i) == 'F'){
                hex = true;
            }
            else {
                hex = false;
            }
        }
        if(hex)
            System.out.println("Hexadecimal");
        else
            System.out.println("Not Hexadecimal");
    }
}