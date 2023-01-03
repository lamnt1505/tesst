/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MonthInfo {
    public static void main(String[] args) {
        int thang, nam;
        Scanner s = new Scanner(System.in);
                
        System.out.print("Nhap Nam:");
        nam = s.nextInt();
        
        System.out.print("Nhap Thang");
        thang = s.nextInt();
        
        switch(thang)
        {
            case 2:
                if(nam % 4 == 0 && nam % 100 != 0 ){
                    System.out.println("Thang co 29 ngay");
                }else{
                    System.out.println("Thang co 28 ngay");
                }
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 31 ngay");
                break;
            default:
                System.out.println("Thang co 30 ngay");
        }
    }
}
