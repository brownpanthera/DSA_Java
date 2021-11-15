package com.company;

public class NewFibo {
    public static void main(String[] args) {

        int ans = fibonacci(3);
        System.out.println(ans);
    }
    static int fibonacci(int n){

        // base condition
        if (n < 2){
            return n;
        }

        // recursive call
        return fibonacci(n -1) + fibonacci(n -2);
    }

}
