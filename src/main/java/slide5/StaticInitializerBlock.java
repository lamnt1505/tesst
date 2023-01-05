package slide5;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static int B = 1;
    private  static int H = 3;
    public  static boolean flag;

    public static void main(String [] args){
        if(flag){
            int area = B * H;
            System.out.println(area);
        }
    }
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }else{
            flag = true;
        }
    }
}
