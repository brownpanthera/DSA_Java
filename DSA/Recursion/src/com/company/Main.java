package com.company;

public class Main {

    public static void main(String[] args) {

        int ans = fibo(4);
        System.out.println(ans);

    }

    static int fibo(int n){

     // base condition
        if (n < 2) {
            return n;
        }

        return fibo(n -1) + fibo(n - 2);
    }
}
