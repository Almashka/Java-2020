package feb_24;

public class ReplaceLetters {
    public static void replaceLetters(String text, char toBeReplaced, char toReplace){
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == toBeReplaced){
                System.out.print(toReplace);
            }
            else{
                System.out.print(text.charAt(i));
            }
        }
    }
    public static String replaceChar(String text, char remove, char newChar){
        String replaced = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == remove){
                replaced += newChar;
            }
            else{
                replaced += text.charAt(i);
            }
        }
        return replaced;
    }
}