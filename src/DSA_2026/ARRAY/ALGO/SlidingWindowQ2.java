package DSA_2026.ARRAY.ALGO;

import java.util.ArrayList;

public class SlidingWindowQ2 {

    /*
    K Sized Subarray Maximum
Difficulty: Medium
Accuracy: 26.04%
Submissions: 417K+
Points: 4
GfG question
Given an array arr[] of positive integers and an integer k.
You have to find the maximum value for each contiguous subarray of size k.
Return an array of maximum values corresponding to each contiguous subarray.

     */

    static ArrayList<Integer> maxSumofArray(int [] arr,  int k){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int  i = 0; i < n - k + 1 ; i++){
            int max = arr[i];
            for(int j = 1 ; j < k ; j++){
                if(arr[i + j] > max){
                    max = arr[i+j];
                }
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println(maxSumofArray(arr, 3));
    }
}
