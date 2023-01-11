package slide5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAssgiment9 {

    public static void main(String[] args) {

    }

    public static String getAccount(){
        Scanner sc = new Scanner(System.in);
        String account = "";
        while (true){
            System.out.print("input account: ");
            account = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10}$");
            if (p.matcher(account).find()){
                break;
            }else{
                System.out.println("Invalid account, please input again");
            }
        }
        return account;
    }
}
