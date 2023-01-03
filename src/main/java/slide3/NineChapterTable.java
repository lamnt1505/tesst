package slide3;

public class NineChapterTable {
	
	public static void main(String[] args) {
		//int x = 8;
		for(int x  = 1; x < 10; x++) {
			for(int i = 1; i <= 10; i++) {
				int result = x * i;
				System.out.printf("%5d x %5d = %5d", x, 1, result);
				System.out.println();
			}
		}
	}
}
