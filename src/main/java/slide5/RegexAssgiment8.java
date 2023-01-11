package slide5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAssgiment8 {

    public static void main(String[] args) {
        String password = getpassword();
        System.out.println("password: "+ password);
    }
    public static String  getpassword() {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true){
            System.out.println("input password");
            password = sc.nextLine();
            Pattern pUpper = Pattern.compile("^.*[A-Z] + .*$");
            Pattern pLower = Pattern.compile("^.*[a-z] + .*$");
            Pattern pDigit = Pattern.compile("^.*[0-9] + .*$");
            Pattern pSpecial = Pattern.compile("^.*[#?!@$%^&*-] + .*$");
            Pattern pLength = Pattern.compile("^.{8,}$");

            if(pUpper.matcher(password).find() || pLower.matcher(password).find()
                    || pDigit.matcher(password).find() ||
               pSpecial.matcher(password).find() || pLength.matcher(password).find()) {
                break;
            }else{
                System.err.println("password is not oke");
            }
        }
        return password;
    }
}
