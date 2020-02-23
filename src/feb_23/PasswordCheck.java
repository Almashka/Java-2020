package feb_23;

public class PasswordCheck {
    public static void main(String[] args) {
        passCheck("qwerty");
        String check = passwordCheck("asdf");
        System.out.println(check);
        System.out.println(isPasswordGood("password "));
        String password = "123456";
        if(isPasswordGood(password)){
            System.out.println("Length is OK");
        }
    }
    public static void passCheck(String password){
        if(password.length() < 6){
            System.out.println("NOT OK");
        }
        else{
            System.out.println("OK");
        }
    }
    public static String passwordCheck(String password){
        String result;
        if(password.length() >= 6){
            result = "OK";
        }
        else{
            result = "NOT OK";
        }
        return result;
    }
    public static boolean isPasswordGood(String password){
        boolean result;
        if(password.length() < 6){
            result = false;
        }
        else {
            result = true;
        }
        return result;
    }
}