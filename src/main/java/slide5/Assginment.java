package slide5;

import java.util.Arrays;
import java.util.Scanner;

public class Assginment {
    static int [] assgiment(int [] nums,int target){
		for (int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length;i++){
				if(nums[i] + nums[j] == target){
					return new int []{i,j};
				}
			}
		}
		return new int[]{};
	}

	public static void main(String [] args){
		int [] nums = {2,7,11,15};
		int target = 9;
		int [] D = assgiment(nums,target);
		System.out.println("Be cause nums[0] + nums[1] == 9 , we return [0,1] \n" + Arrays.toString(D));
	}
}
