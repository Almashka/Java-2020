package JavaReview;

import java.util.Scanner;

public class Company {
    String name;

    Company(){
        name = "DELL Computers";
    }
    public Company(String name){
        this.name = name;
    }

    /*public void get(){
        System.out.println(this.name);
    }*/

    public static void main(String[] args) {
        Company object = new Company();
        Company obj = new Company("HP");
        System.out.println(object.name);
        System.out.println(obj.name);
        //object.get();
        //obj.get();
    }
}
