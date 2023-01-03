/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap So");
            num = scanner.nextInt();

            if(num > 0){
                double sqrt = Math.sqrt(num);
                System.out.println("Square root:" + sqrt);
            }else{
                System.out.println("Error: so am");
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("ThanhCong!!!");

    }
}
