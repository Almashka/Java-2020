package JavaReview;

public class SentenceToArray {
    public static void main(String[] args) {
        String sentence = "Today there is a great weather";
        String[] newArray = covertToArray(sentence);
        for(String word : newArray){
            System.out.print(word + "\t");
        }
        //System.out.println(newArray[1]);
    }
    public static int splitSentence(String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static String[] covertToArray(String sentence){
        sentence += " ";    // same as sentence = sentence + " ";
        int numberOfWords = splitSentence(sentence);
        String[] sentenceAsArray = new String[numberOfWords];
        String word = "";
        int counter = 0;

        for(int i = 0; i < sentence.length(); i++){
            word = word + sentence.charAt(i);
            if(sentence.charAt(i) == ' '){
                sentenceAsArray[counter] = word;
                counter++;
                word = "";
            }
        }
        return sentenceAsArray;
    }
}
