package com.company;

import java.util.Arrays;

public class findduplicate {
    public static void main(String[] args) {
        int nums[]  = {3, 1, 4, 4, 2};
        int ans = duplicate(nums);
        System.out.println(ans);
    }

    static int duplicate(int[] nums){
        int i = 0;
        while(i < nums.length){
            if (nums[i] != i + 1){

                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
