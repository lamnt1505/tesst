package slide5;

import java.util.Arrays;

public class Assgiment3 {
    public static int [] Assgiment3(int [] sums, int target){
        for(int i = 0; i < sums.length; i++){
            for(int j = i + 1; j < sums.length; j++){
                if(sums[i] + sums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String [] args){
        int[] sums = {3,3};
        int target = 6;
        int [] S = Assgiment3(sums,target);
        System.out.println("Print" + Arrays.toString(S));
    }
}
