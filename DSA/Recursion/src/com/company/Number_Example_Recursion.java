package com.company;

public class Number_Example_Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // base condition
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);     // body
        print(n + 1);            // recursive call
    }
}
