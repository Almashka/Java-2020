package feb_23;

public class TopToBottom {
    public static void main(String[] args) {
        topToBottom("Hello");
    }
    public static void topToBottom(String word){
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}