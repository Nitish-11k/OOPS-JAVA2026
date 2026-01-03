package DSA_2026.ARRAY;

import java.util.HashSet;

public class DuplicateWithInKDistance {

    /*
Given an integer array arr[] and an integer k, determine whether there exist two indices i and j such that
arr[i] == arr[j] and |i - j| ≤ k. If such a pair exists, return 'Yes', otherwise return 'No'.

Examples:

Input: k = 3, arr[] = [1, 2, 3, 4, 1, 2, 3, 4]
Output: No
Explanation: Each element in the given array arr[] appears twice and the distance between
every element and its duplicate is 4.

Input: k = 3, arr[] = [1, 2, 3, 1, 4, 5]
Output: Yes
Explanation: 1 is present at index 0 and 3.
     */

    /*
    First with the brute force approach
    Time Complexity O(n^2)
    Space Complexity O(1)
     */
    static String bruteForce(int [] arr, int k){
        for(int i = 0;  i < arr.length; i ++){
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j]){
                    if (Math.abs(i-j) <= k){
                        return "Yes";
                    }
                }
            }
        }
        return "No";
    }

    /*
    Next Best Approach is use HashSet to solve this question
    Time Complexity O(n)
    Space Complexity for this O(k)  where k is the value given in the question
     */
    static String bestApproach(int [] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]))
                return "Yes";

            set.add(arr[i]);

            if(i >= k)
                set.remove(arr[i-k]);
        }
        return "No";
    }


    public static void main(String [] args){
        int [] arr = {10, 5, 3, 4, 3, 5, 6};
        int k = 3;
//        System.out.println(bruteForce(arr, k));
        System.out.println(bestApproach(arr, k));
    }
}
