package JavaReview;

public class Student {
    private String name;
    private Student(String n){
        this.name = n;
    }
    public Student(){
        name = "unknown";
    }
    public void getName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student b1 = new Student("John");
        Student b2 = new Student();
        b1.getName();
        b2.getName();
    }
}
