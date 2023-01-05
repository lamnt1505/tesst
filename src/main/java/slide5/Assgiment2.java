package slide5;

import java.util.Arrays;

public class Assgiment2 {
    static int [] Assgiment2(int [] nums,int target){
        for (int i = 0 ; i < nums.length; i++){
            for (int j = 0 + 1; j < nums.length;i++){
                if(nums[i] + nums[j] == target){
                    return new int[]{j,i};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String []args){
        int [] nums = {3,2,4};
        int target = 6;
        int [] D = Assgiment2(nums,target);
        System.out.println("print \n" + Arrays.toString(D));
    }
}
