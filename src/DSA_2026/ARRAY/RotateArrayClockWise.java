package DSA_2026.ARRAY;

public class RotateArrayClockWise {

//    This is the brute force approach for rotating an array Clockwise
    static void rotateArray(int [] arr, int d){
        int n = arr.length;
        d = d % n;  // if d is larger than n

        for(int i = 0; i < d; i++){
            int last = arr[n-1];
            for(int j = n-1; j > 0; j--){
                arr[j] = arr[j-1];
//                arr[j] = arr[j+1] for doing the CounterClockwise Rotation
             }
            arr[0] = last;
        }
    }

/*    Now here we are using Better approach not the Best Approach
       In this Approach We are using an Temporary array for Rotating an Array
 */

    static void rotateArrayTemporary(int [] arr, int d){
        int n = arr.length;
        d = d % n;

        int [] temp = new int[n];

/*       Here we are storing the last element of an Array in the beginning of Temporary array
          By Iterating the array from 0 to d
 */
        for(int i = 0 ; i < d; i++){
            temp[i]  = arr[n - d + i];
        }

        /*
        Now Here we are using Another loop to Storing the initial Element of Actual Array
        in the last of Temporary array
        from iterating  0 to n-d
         */
        for(int i = 0; i < n-d ; i ++){
            temp [i+d] = arr[i];
        }

        /*
        Now we are again run a for loop
        For Coping the element of Temporary array in actual array
         */
        for(int i = 0; i< n; i++){
            arr[i] =temp[i];
        }
    }

    /*
    Now we are solving the Same Problem with the Optimized Solution
    Using Recursion
     */
    static void rotateArrayRecurrsion(int [] arr, int d){
        int n = arr.length;
        d = d % n; //  i am using it because if the d is greater than n
        /*
        example:
        d = 7 and n =5
        then 7% 5 = 2 and 2 is the remainder
         */

        ReverseOrSwap(arr, 0, n-1); // reversing the entire array
        ReverseOrSwap(arr, 0, d-1); // then the first d element array
        ReverseOrSwap(arr, d, n-1); // then d se n-1

    }
    static void ReverseOrSwap(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5, 6};
        int d  = 2;
//        rotateArrayTemporary(arr, d);

        rotateArrayRecurrsion(arr, d);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
