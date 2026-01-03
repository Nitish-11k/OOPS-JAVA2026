package DSA_2026.SORTING;

public class SelectionSorting {

    /*
    Selection Sort is a comparison-based sorting algorithm.
    It sorts by repeatedly selecting the smallest (or largest) element.

    Find the smallest element and swap it with the first element.
    This way we get the smallest element at its correct position.
    Then find the smallest among remaining elements (or second smallest) and
    swap it with the second element.

    Time Complexity O(n^2)
    Space Complexity is O(1) because it do in-place sorting not require any extra space
     */

    static void sortTechnique(int [] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){

            int min_index = i;

            for(int j = i+1; j <  n; j++){

                if(arr[j] < arr[min_index]){

                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= temp;
        }
    }

    static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele  + " ");
        }
    }

    public static void main(String [] args){

        int [] arr= {3, 2, 6, 1, 9, 7, 4, 5, 8};

        sortTechnique(arr);
        print(arr);
    }
}
