package slide3;

import java.util.Scanner;


public class student {
    public static void main(String[] args) {
        float diem = -1;        
        Scanner s = new Scanner(System.in);        
        do{
            System.out.print("Nhap Diem: ");
            
            diem = s.nextFloat();

            if(diem <   0 || diem >10){
                System.out.println("Diem nhap sai.Vui long nhap lai diem (0 - 10)");
            }
        }while (diem <   0 || diem >10);
        
        System.out.printf("Diem cua ban vua nhap la: %f",diem);
    }
}
