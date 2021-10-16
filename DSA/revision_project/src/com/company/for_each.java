package com.company;

public class for_each {

    public static void main(String[] args) {

        int[] arr = {12, 3, 5, 67, 67};
         for(int i : arr){
             System.out.println(i);  // in for loop we do arr[i] but in forEach we do only i
         }
    }
}
