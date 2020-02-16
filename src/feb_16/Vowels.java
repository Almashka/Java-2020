package feb_16;

public class Vowels {
    public static void main(String[] args) {
        String str = "What a cloudy day";
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u'){
                System.out.print(str.charAt(index) + " ");
            }
        }
    }
}