package DSA_2026.ARRAY.ALGO;

import java.util.ArrayList;

public class PrefixSum {

    static ArrayList<Integer> subsPrefAlgo(int [] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        result.add(arr[0]);

        for(int i = 1; i < n; i++ ){
            result.add(result.get(i-1) + arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> pref = subsPrefAlgo(arr);
        System.out.print(pref);
    }
}
