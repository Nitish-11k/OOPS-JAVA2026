package DSA_2026.ARRAY;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterELement {

    static ArrayList<Integer> leaders(int [] arr){

//      This is the naive approach for this formula

        int n = arr.length;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i  =0; i < n; i++){
            int j;
            for(j  = i + 1; j< n; j++){
                if(arr[i] < arr[j])
                      break;
            }
            if(j == n)
                array.add(arr[i]);
        }
        return array;
    }

//  Now this is the efficient Approach Using Stack

    static ArrayList<Integer> leaderElement(int [] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int maxRight = arr[n-1];

        result.add(maxRight);

        for(int i = n -2; i >= 0; i--){
            if(arr[i] >= maxRight){
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args){
        int [] arr = {12, 17,  6,  1, 2, 5};
        ArrayList<Integer> result = leaderElement(arr);
        for(int a : result){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
