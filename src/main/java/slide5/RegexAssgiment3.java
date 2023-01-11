package slide5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssgiment3 {

    public static void main(String[] args) {
        String mail = getMail();
        System.out.println("mail" + mail);
    }
    public static String getMail(){
        Scanner sc = new Scanner(System.in);
        String mail = "";
        while(true){
            System.out.print("input mail: ");
            mail = sc.nextLine();
            Pattern p = Pattern.compile("^[a-zA-z][a-zA-Z0-9] + @[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");
            if(p.matcher(mail).find()){
                break;
            }else{
                System.out.println("Invalid mail,please input again");
            }
        }
        return mail;
    }
}
