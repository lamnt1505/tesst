package slide3;

import java.util.Scanner;

public class PRG {

	public static void Menu() {
		System.out.println(">> Máy Tính Cá Nhân <<");
		System.out.println("+--------------------+");
		System.out.println("| 1.Công			 |");
		System.out.println("| 2.Trừ			 	 |");
		System.out.println("| 3.Kết Thúc		 |");
		System.out.println("Nhập Chức Năng:");		
		int select;//khai báo biến chọn
		Scanner scanner = new Scanner(System.in);//đọc gt từ bàn phím
		select = scanner.nextInt();//gán chọn = scn
		
		switch(select) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			default:
				System.out.println("See you again");
				System.exit(0);
		}
	}

	private static void sub() {
		System.out.println("Add");
	}

	private static void add() {
		System.out.println("Sub");		
	}
	
	public static void main(String[] args) {
		Menu();
		
		System.out.println("Complete!!!");
	}

}
