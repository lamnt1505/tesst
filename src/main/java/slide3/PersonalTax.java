/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide3;


public class PersonalTax {
    public static void main(String[] args) {
            double luong = 3000000;
            double thuong = 20;

            double thuNhap = luong + thuong;

            double thue = 0;

            if(thuNhap >= 3000000){
                thue = thuNhap * 0.3; //tuong duong 30%
            }else 
                if (thuNhap < 3000000 && thuNhap > 1500000){
                thue = thuNhap * 0.15; //tinh ra 15%
            }else{
                if(thuNhap >= 900000){
                    thue = thuNhap * 0.1; //10%
            }else{
                thue = 0;    
            }
            System.out.printf("Tong thu nhap chua the cua ban la %.2f",thuNhap);
            System.out.printf("Thue cua ban la: %.2f",thue);
        }
    }
}    
