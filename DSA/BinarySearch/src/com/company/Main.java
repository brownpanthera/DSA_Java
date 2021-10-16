package com.company;

public class Main {

    public static void main(String[] args) {
       int[] arr = {-18, 10, 11, 24, 33, 45, 55, 78, 83,90};
       int target = 10;
       int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    // Binary Search

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }

}
