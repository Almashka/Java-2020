package JavaReview;

public class Constructor {
    int a;
    Constructor(){
        System.out.println("My constructor is being called");
        a = 90;
    }

    public static void main(String[] args) {
        Constructor object = new Constructor();
        System.out.println(object.a);
    }
}
