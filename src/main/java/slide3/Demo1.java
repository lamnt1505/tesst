package slide3;

public class Demo1 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("123456789");
		
		System.out.println("Before removal String = " + str.toString());
		
		StringBuilder afterRemoval = str.delete(1, 8);

		System.out.println("After removal String = "
                + afterRemoval.toString());
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(123);
		sb.append("456789");
		
		sb.delete(2, 8);
		System.out.println("Đã Xóa" + sb.toString());
	}

}
