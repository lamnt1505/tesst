package slide5;

import java.util.Arrays;

public class Assginment1 {
    static int [] assgiment(int [] nums,int target){
		for (int i = 0; i < nums.length; i++){
			for(int j = 0 ; j < nums.length;i++){
				if(nums[i] + nums[j] == target){
					return new int []{j,i};
				}
			}
		}
		return new int[]{};
	}


	public static void main(String [] args){
		int [] nums = {2,11,7,15};
		int target = 9;
		int [] D = assgiment(nums,target);
		System.out.println(Arrays.toString(D));
	}
}
