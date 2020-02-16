package feb_16;

public class LowerCaseLetters {
    public static void main(String[] args) {
        String sentence = "I never Forget to push my Codes to GitHub";
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122){
                System.out.print(sentence.charAt(i) + " ");
            }
        }
    }
}