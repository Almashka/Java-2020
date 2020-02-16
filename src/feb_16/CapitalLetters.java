package feb_16;

public class CapitalLetters {
    public static void main(String[] args) {
        String sentence = "BootCamp Attendees Rock";
        char letter;
        for(int i = 0; i < sentence.length(); i++) {
            letter = sentence.charAt(i);
            if(letter >= 65 && letter <=90){
                System.out.println(letter);
            }
        }
    }
}