package slide5;

import java.util.Arrays;

public class Assgiment5 {
    static int[] Assgiment5(int[] sums, int target){
        for (int i = 0; i < sums.length;i++){
            int j = 0 + 1;
            if(sums[i] + sums[j] == target){
                return new int[]{j,i};
            }
        }
        return new int[]{};
    }
    public static void main(String [] args){
        int [] sums = {3,2,4};
        int target = 6;
        int [] D = Assgiment5(sums,target);
        System.out.println(Arrays.toString(D));
    }
}
