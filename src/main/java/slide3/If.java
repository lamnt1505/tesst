package slide3;

import java.util.Scanner;

public class If {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        if (n % 4 != 0 ) {
            System.out.println("Weird");
        } else if(n % 4 == 0 & n >= 2 && n <= 5 ){
            System.out.println("Not Weird");
        }else if(n % 4 == 0 & n >= 6 && n <= 7){
            System.out.println("Weird");
        }else if(n % 4 == 0 & n >20){
            System.out.println("Not Weird");
        }
    }
}
