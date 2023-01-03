/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide3;

/**
 *
 * @author DELL
 */
public class TrungBinh {
    public static void main(String[] args) {
        int i = 27; // i -> 270
        int sum = 0, count = 0;
        
        while(i <= 270){ 
            if(i % 3 == 0){
               sum += i;
               count ++;
            }
            
            i++;
        }
        float avg = (float) sum / count;
        
        System.out.printf("Tong cac so chia het cho 3: %d", count);
        System.out.printf("Tong cac so:%d - Trung Binh cac so: %f ",sum,avg);
    }
}
