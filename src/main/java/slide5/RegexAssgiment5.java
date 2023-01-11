package slide5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAssgiment5 {

    public static double getNumber(){
        Scanner sc = new Scanner(System.in);
        double result = 0;
        while (true){
            System.out.print("input number: ");
            String number = sc.nextLine();
            Pattern p1 = Pattern.compile("^[0-9] + $");
            Pattern p2 = Pattern.compile("^[0-9] +.[0-5][0]*$");
            if(p1.matcher(number).find() || p2.matcher(number).find()){
                result = Double.parseDouble(number);
                if(result >= 8 && result <= 17.5){
                    break;
                }else{
                    System.out.println("number within - 17.5");
                }
                break;
            }else{
                System.out.println("Invalid number, please input again");
            }
        }
        return result;
    }

    public static void main(String [] args){
        double n = getNumber();
        System.out.println("number: " + n);
    }

}
