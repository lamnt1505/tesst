package slide5;

import java.util.Arrays;

public class Assgiment4 {
    static int[] Assgiment4(int[] sums, int target){
        for(int i = 0; i < sums.length; i++){
            int j = 0;
            if(sums[i] + sums[j] == target){
                return new int[]{j,i};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] sums = {2,11,7,15};
        int target = 9;
        int [] A = Assgiment4(sums,target);
        System.out.println(Arrays.toString(A));
    }
}
