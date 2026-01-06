package DSA_2026.SORTING;

public class BinarySearch {

    public static int approach(int [] arrr, int target){
        int start  = 0, end = arrr.length;
        while(start < end){
            int mid  = (start + end) /2;
            if(arrr[mid] == target){
                return  mid;
            }
            else if(arrr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1; // if target element not found
    }

    public static void main(String[] args) {
        int [] arr = {1, 2,3, 4, 10, 12, 15, 20, 30, 33, 34};
        int target = 15;
        System.out.println(approach(arr, target));

    }
}
