package DSA_2026.ARRAY.ALGO;

import java.util.ArrayList;

public class SlidingWindowQ1 {

    static ArrayList<Integer> sum(int [] arr, int target){

        int start  = 0;
        int max_sum  = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int end  = 0; end < arr.length ; end ++){
            max_sum = max_sum + arr[end];

            while(max_sum > target && start < end){
                max_sum = max_sum - arr[start];
                start++;
            }
            if(max_sum == target) {
                result.add(start + 1); // 1 base indexing
                result.add(end + 1);
                return  result;
            }
        }
        result.add(-1);
        return result;
    }

    public static  void main(String [] args){
        int [] arr = {1, 2,3, 4, 5, 6, 7};
        int target = 9;
        System.out.println(sum(arr, target));

    }
}
