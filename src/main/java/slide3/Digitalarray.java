package slide3;

import java.util.Iterator;
import java.util.Scanner;

public class Digitalarray {
	
	public static void main(String[] args) {
		int [] mang = new int [10];
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		do {
			System.out.printf("mang[%d] = ", i);
			mang[i] = scanner.nextInt();
			
			i++;
		}while(i<10);
		
		int sum = 0;
		for (int item : mang) {
			sum += item;
		}
		System.out.println("Tong cac phan tu mang: " +sum);
		float avg = (float) sum / mang.length;
		
		System.out.println("Gia tri trung binh cua cac phan tu:" + avg);
	}
}
