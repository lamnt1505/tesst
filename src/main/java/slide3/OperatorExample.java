package slide3;

import java.util.Scanner;

public class OperatorExample {
	
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Email:");
		String email = in.nextLine();
		
		System.out.print("Số điện thoại:");
		String phone = in.nextLine();
		
		String reEmail = "\\w+@\\w+\\.\\w+";
		if(!email.matches(reEmail)) {
			System.out.println("Không đúng định dạng email");
		}
		
		String rePhone = "0543\\d{6}";
		if(!phone.matches(rePhone)) {
			System.out.println("Không phải số điện thoiaj ở huế !");
		}
	}
	
}
