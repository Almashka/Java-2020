package JavaReview;

import javax.xml.namespace.QName;

public class MethodOverload {
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public String sum(String name){
        return name;
    }

    public static void main(String[] args) {
        MethodOverload object = new MethodOverload();
        System.out.println(object.sum(11,89));
        System.out.println(object.sum("Houston"));
        System.out.println(object.sum(1,2,3));
    }
}
