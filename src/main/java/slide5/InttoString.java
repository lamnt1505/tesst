package slide5;

import java.util.Scanner;

public class InttoString {
    public static void main(String [] args){
        int n = 10;
        if(n >= -100 || n < 100)
        {
            String s1 = String.valueOf(n);
            System.out.println("GoodJob");
        }else {
            System.out.println("Wrong answer");
        }
    }
}
