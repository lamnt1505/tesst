package slide5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAssgiment6 {

    public static String  getPhone() {
        Scanner sc = new Scanner(System.in);
        String phone = null;
        while (true){
            System.out.println("input phone");
            phone = sc.nextLine();

            Pattern p = Pattern.compile("^[0-9]{10}$");
            Pattern p1 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
            Pattern p2 = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{4}$");
            Pattern p3 = Pattern.compile("^[0-9]{3} [0-9]{3} [0-9]{4}$");
            Pattern p4 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$");
            Pattern p5 = Pattern.compile("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$");
            if(p.matcher(phone).find() || p1.matcher(phone).find()||p2.matcher(phone).find()|| p3.matcher(phone).find()
                ||p4.matcher(phone).find() || p5.matcher(phone).find()){
                System.out.println("phone is oke");
                break;
            }else{
                System.out.println("phone is not oke");
            }
        }
        return phone;
    }

    public static void main(String [] args){
        String phone = getPhone();
        System.out.println("phone: "+ phone);
    }
}
