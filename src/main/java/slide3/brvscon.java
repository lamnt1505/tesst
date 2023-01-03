package slide3;

import java.util.Scanner;

public class brvscon {

	public static void main(String[] args) {//lưu vào stack
		int i, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Dừng chương trình thì nhập 0.");
			System.out.println("Bỏ qua nhập số 1.");
			System.out.println("Nhập vào số :");
			i = scanner.nextInt();
			
			if(i==1) {
				continue;
			}
			if(i==0) {
				break;
			}
			System.out.println("Số bạn vừa nhập là:" + i);
		}
	}

}
