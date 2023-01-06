package slide5;

import java.util.Arrays;

public class Assgiment6 {
    static int[] Assgiment6(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            int j = 0;
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public static void main(String [] args){
        int [] nums = {3,3};
        int target = 6;
        int [] M = Assgiment6(nums,target);
        System.out.println(Arrays.toString(M));
    }
}
