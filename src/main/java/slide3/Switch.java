package slide3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int month, year;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Year:");
		year = s.nextInt();
		
		System.out.print("Enter Month:");
		month = s.nextInt();
		
		switch(month){
			case 2:
				if(year % 4 == 0 && year % 100 != 0) {
					System.out.println("Month has 29 days");
				}else {
					System.out.println("Month has 28 days");
				}
				break;
			case 4: 
			case 6:
			case 9:
			case 11:
				System.out.println("month has 31 days");//tháng có 31 ngày
				break;
			default:
				System.out.println("month has 30 days");//tháng có 30 ngày
		}
	}

}
