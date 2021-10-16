//package com.company;
//
//import java.util.Arrays;
//
//public class bubble {
//    public static void main(String[]args){
//
//        int[] arr = {3, 1, 5, 4, 2};
//        bubbleAlgo(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void bubbleAlgo(int[]arr){
//        boolean swapped;
//        for(int i = 0; i < arr.length; i++){
//            swapped = false;
//            for (int j = 0; j < arr.length - i -1; j++){
//
//                if (arr[j + 1] < arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == false){
//                break;
//            }
//        }
//    }
//}
