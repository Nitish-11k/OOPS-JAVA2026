package DSA_2026.SORTING;

public class InsertionSort {

    static void sort(int [] arr){
        for(int i =1 ; i < arr.length; i++){
            /* We are assuming that first element in an array is already sorted that's why
                we start iterating from the second element
                1 to arr.length
             */
            int key = arr[i];
            int j = i - 1;

            while( j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j= j -1;
            }
            arr[j+1]= key;
        }
    }

    static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main (String [] args){
        int [] arr = {2, 5, 4, 1, 7, 6, 3};
        sort(arr);
        print(arr);
    }
}
