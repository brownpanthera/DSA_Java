package com.company;

public class maximumValue {
    public static void main(String[] args) {

        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(arr[max]);
    }
}
