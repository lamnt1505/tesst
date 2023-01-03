package slide3;

public class for_each {
	public static void main(String[] args) {
		int[] a = {9, 3 , 8 , 7 , 3, 9 , 4 , 2};
		
		double total = 0;
		for(int x : a) {
			if(x % 2 == 0) { 
				total += x;
			}
		}
		System.out.print("Total:" + total);
	}
}
