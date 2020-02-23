package feb_23;

public class PrintingNames {
    public static void main(String[] args) {
        System.out.println("Sunday is fun day with Java");
        printMyName();
        printMyName2("It is always fun with Java");
        System.out.println(printMyName3());
        System.out.println(printMyName4("So you are also in love with Java"));
    }
    public static void printMyName(){
        System.out.println("Yes sure");
    }
    public static void printMyName2(String name){
        System.out.println(name);
    }
    public static String printMyName3(){
        return "Oh yeah, I love Java too";
    }
    public static String printMyName4(String name){
        return name;
    }
}