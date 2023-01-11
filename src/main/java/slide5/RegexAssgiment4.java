package slide5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAssgiment4 {
    public static void main(String[] args) {
        double number = getDouble();
        System.out.println("double" + number);
    }

    public static double getDouble(){
        Scanner sc = new Scanner(System.in);
        String number = "";
        while(true){
            System.out.print("input number:");
            number = sc.nextLine();
            Pattern p = Pattern.compile("^(\\-)?[0-9]+(.[0-9]+)?$");
            if(p.matcher(number).find()){
                break;
            }else{
                System.err.println("Invalid dobule, please input again");
            }
        }
        return Double.parseDouble(number);
    }
}
