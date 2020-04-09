package JavaReview;

public class MainPerson {
    public static void main(String[] args) {
        Person obj = new Person("Steve");
        Person obj1 = new Person("Emily");

        Person.setCompanyName("QWERTY");
        obj.getPersonInfo();
        obj1.getPersonInfo();
    }
}