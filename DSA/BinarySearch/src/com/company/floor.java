package com.company;

public class floor {
    public static void main(String[]args){

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;;
        int ans = Floor(arr,target);
        System.out.println(ans);
    }

    // return the index of greatest number <= target
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //Find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }

}
