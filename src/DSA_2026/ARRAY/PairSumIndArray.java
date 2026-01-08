package DSA_2026.ARRAY;

import java.util.Arrays;
import java.util.HashSet;

public class PairSumIndArray {

/*   Using naive approach first
       In this approach we are using hashSet to solve this problem

 */

    static boolean naiveApproach(int [] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int remaining = target - arr[i];
            if(set.contains(remaining)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    /*
    Now we are using optimized approach
    in this approach i am using two pointer approach
     */

    static  boolean optimizedApproach(int  [] arr, int target){
        Arrays.sort(arr);
        int start = 0, end = arr.length -1;

        while(start < end){
            if(arr[start] + arr[end] == target){
                return true;
            } else if (arr[start] + arr[end] < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        if (optimizedApproach(arr, target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
