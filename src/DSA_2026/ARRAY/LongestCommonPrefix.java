package DSA_2026.ARRAY;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*
    Naive Approach
    Time Compexity is O(n * m^2) where m is the length of String
     */

    static String naiveApproach(String [] arr){
        String first = arr[0];
        String result = "";
        for(int i = 1; i <= first.length(); i++){
            String prefix = first.substring(0, i);
            for(int j = 1; j < arr.length; j++){
                if(!arr[j].startsWith(prefix)){
                    return result;
                }
            }
            result = prefix;
        }
        return result;
    }


    public static void main(String [] args){
        String [] str = {"Flower", "Fly", "Float"};
        String result = naiveApproach(str);
        System.out.print(result);
    }
}
