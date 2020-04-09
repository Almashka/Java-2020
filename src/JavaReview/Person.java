package JavaReview;

public class Person {
    static String companyName;
    private String name;
    private int ssn;
    static int counter = 0;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    static void setCompanyName(String name){
        companyName = name;
    }

    static int setSSN(){
        counter++;
        return counter;
    }
    public Person(String name){
        this.name = name;
        this.ssn = setSSN();
    }

    void getPersonInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("SSN: " + this.ssn);
        System.out.println("Company name: " + companyName);
    }
}
