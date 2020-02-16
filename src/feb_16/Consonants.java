package feb_16;

public class Consonants {
    public static void main(String[] args) {
        String sentence = "Sunday, fun day!";
        int index = 0;
        while(index < sentence.length()) {
            if (!(sentence.charAt(index) == 'a' || sentence.charAt(index) == 'e' || sentence.charAt(index) == 'i' || sentence.charAt(index) == 'o' || sentence.charAt(index) == 'u')) {
                System.out.print(sentence.charAt(index) + " ");
            }
            index++;
        }
    }
}