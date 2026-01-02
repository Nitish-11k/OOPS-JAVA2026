package DSA_2026.ARRAY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    First we are using the brute force approach to solve this question
    in this approach the time complexity is O(n^2)
    and space complexity is O(1)
     */
    static int [] naiveApproach(int [] arr, int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    /* Now we are using Better Approach for solving the same problem
    We use two pointer approach to solve this question
    Time Complexity = O( n)
    Space Complexity = O(1)
     */

    static int [] betterApproach(int [] arr, int target){
        Arrays.sort(arr); // While implementing two pointer , you must sort the array first.
        int i = 0, j = arr.length -1;

        while(i < j){
            int sum  = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i, j};
            }
            else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    /*

    Now the best approach or the recommended approach
    We are using hashing in it.
    Time Complexity is  O(n)
    Space Complexity is O(n)
    This approach is Simple , fast and interview Favourite
     */

    static int [] recommendedApproach(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int required = target - arr[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String [] args){
        int [] arr = {2, 3, 5, 4, 9, 10};
        int target = 8;
//        int [] result = naiveApproach(arr, target);
//        int [] result = betterApproach(arr, target);
        int [] result = recommendedApproach(arr, target);
        System.out.println("Pair sum : "  + Arrays.toString(result));
    }
}
