package slide5;

import java.util.Scanner;

public class EOF {
    public static void main(String [] args){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world\n" +
                "I am a file\n" +
                "Read me until end-of-file");
        name = sc.nextLine();
    }

}
