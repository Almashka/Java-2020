package JavaReview;

public class Employee {
    String name;
    private Employee(String name){
        this.name = name;
        System.out.println(name + " employee is added");
    }

    public static void main(String[] args) {
        Employee n1 = new Employee("David");
        Employee n2 = new Employee("Rebecca");
        Employee n3 = new Employee("Bob");
    }
}
