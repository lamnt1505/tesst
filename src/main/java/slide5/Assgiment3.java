package slide5;

import java.util.Arrays;

public class Assgiment3 {

    static int[] Assgiment3(int [] nums, int target){
        for(int i = 0; i < nums.length;i++){
            for (int j = i + 1; j < nums.length;i++){
                if (nums[i] + nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String [] args){
        int [] nums = {3,3};
        int target = 6;
        int[] S = Assgiment3(nums,target);
        System.out.println("print \n" + Arrays.toString(S));
    }
}
