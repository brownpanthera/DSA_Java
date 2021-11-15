package com.company;

public class max {
    public static void main(String[] args) {

        int arr[] = {1,3,23,9,18};
        int ans = maximumValue(arr);
        System.out.println(ans);
    }

   static int maximumValue(int[] arr){
       int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++){
            if ( arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
   }

}
