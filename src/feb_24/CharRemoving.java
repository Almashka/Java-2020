package feb_24;

public class CharRemoving {
    public static void removeChar(String text, char letter) {
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != letter){
                System.out.println(text.charAt(i));
            }
        }
    }
}