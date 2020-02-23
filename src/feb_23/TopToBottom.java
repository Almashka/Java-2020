package feb_23;

public class TopToBottom {
    public static int smth(){
        return 20;
    }
    public static void main(String[] args) {
        topToBottom("Hello");
    }
    public static void topToBottom(String word){
        System.out.println(smth());
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}