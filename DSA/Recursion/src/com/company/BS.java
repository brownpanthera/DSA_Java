package com.company;

public class BS {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,55,66,78};
        int target = 66;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (arr[middle] == target){
            return middle;
        }

        if (target < arr[middle]){
            return search(arr, target, start, middle - 1);
        }

        return search(arr, target, middle + 1, end);
    }
}
