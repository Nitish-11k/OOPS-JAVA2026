package DSA_2026.ARRAY;

public class MoveZeros {
    /*
    First We are using the Naive Approach whose time and space complexity is O(n) and O(n) respectively
    In this Appraoch we are using temporary array to store all non zeros element first in the Temporary array
    then zeros
     */
    static void naiveApproach(int [] arr){
        int n = arr.length;
        int j  = 0;
        int [] temp = new int [n];
        for(int i = 0; i < n; i++){
            if(arr[i] != 0)
                temp[j++] = arr[i];
        }
        while(j < n){
            temp[j++] = 0;
        }
        for(int k =0; k < n; k++){
            arr[k] = temp[k];
        }
    }

    /*
    Now We are using better approach Two Traversal Approach
    Here we are using two pointer
    Time Complexity is similar to Brute Force Approach
    But Space Complexity is O(1) because we are not using any extra space
     */
    static void betterApproach(int [] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }
        while(count < n){
            arr[count++] = 0;
        }
    }


    /*
    This is the best Approach One Traversal
    It is Similar to Two traversal approach and same in time complexity and space complexity
     */
    static void bestApproah(int [] arr){
        int n = arr.length;
        int count  = 0;
        for(int i =0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }

    public static void main(String [] args){
        int [] arr = {0, 1, 2, 0, 4, 3, 0, 5, 0, 6};
//        naiveApproach(arr);
//        betterApproach(arr);
        bestApproah(arr);
        for(int ele:  arr){
            System.out.print(ele + " ");
        }
    }
}
