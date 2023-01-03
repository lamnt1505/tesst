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
public class PhuongTrinh {
    public static void GPTBN(float a, float b){
        if(a == 0 ){
            if(b == 0){
                System.out.println("Phương trình vô nghiệm");
            }else{
                //a = 0 and b != 0
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            //a != 0
            float nghiem = -b / a;
            System.out.println("Phương trình có 1 nghiệm:");
        }
    } 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a,b;
        
        System.out.print("Nhap a:");
        a = scanner.nextFloat();
        //
        System.out.print("Nhap b:");
        b = scanner.nextFloat();
        
        GPTBN(a,b);
        System.out.println("Ket Thuc");
    }
}
