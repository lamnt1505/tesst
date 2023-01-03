package slide3;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Email:");
		String email = in.nextLine();
		
//		System.out.print("Mã Sinh Viên");
//		String codestudent = in.nextLine();
		
		System.out.print("Số Điện Thoại Huế");
		String phone = in.nextLine();
		
		String reEmail = "\\w+@\\w+\\.\\w+";
		if(email.matches(reEmail)) {
			System.out.println("Email hợp lệ");
		}else {
			System.out.println("Email không hợp lệ");
		}
		
		String rePhone = "0543\\d{6}";
		if(phone.matches(rePhone)) {
			System.out.println("Số điện thoại ở Huế");
		}else {
			System.out.println("Số điện thoại không hợp lệ hoặc không ở huế");
		}
	}

}
