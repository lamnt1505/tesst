package slide3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		float point = -1;

		Scanner s = new Scanner(System.in);

		do {
			System.out.print("Enter a point: ");
			point = s.nextFloat();

			if(point < 0 || point > 10) {
				System.out.println("remote entry point.Enter a point ( 0 - 10)");
			}
		}while(point < 0 || point > 10);

		System.out.printf("your entry point is: %f",point);
	}
}
