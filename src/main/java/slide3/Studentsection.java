package slide3;


import java.util.Arrays;
import java.util.Scanner;

public class Studentsection {
	public static void main(String[] args) {
		
		String svs[] = new String [5];
		float diems[] = new float [5];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.printf("Nhap sinh vien %d", (i+1) );
			svs[i] = s.nextLine();
			
			System.out.printf("Nhap diem thu %d: ", (i+1) );
			diems[i] = s.nextFloat();
			s.nextLine();
		}
		
		System.out.println("Mang sinh vien:" + Arrays.toString(svs));
		System.out.println("Mang diem sinh vien:" + Arrays.toString(diems));
		
		//Arrays.sort(svs);
		for (int i = 0; i < diems.length-1; i++) {
			for(int j = i+1; j < diems.length; j++) {
				if(diems[i] < diems[j]) {
					Float temp = diems[j];
					diems[j] = diems[i];
					diems[i] = temp;
					String st = svs[i];
					svs[i] = svs[j];
					svs[j] = st;
				}
			}
		}
		
		System.out.println("Mang sinh vien sau khi sap xep:" + Arrays.toString(svs));
		System.out.println("Mang diem sinh vien:" + Arrays.toString(diems));
	}


//	static int[] assginment(int[] nums, int target){
//		for(int i = 0; i < nums.length; i++){
//			for (int j = 0 ; j < nums.length;j++){
//				if(nums[i] + nums[j] == target ){
//					return new int []{i,j} ;
//				}
//			}
//		}
//		return new int []{};
//	}
//
//	public static void main(String []args){
//		int[] nums = {2,7,11,15};
//		int target = 9;
//		int [] D = assginment(nums,target);
//		System.out.println(Arrays.toString(D));
//	}
}
