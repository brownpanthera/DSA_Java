package com.company;

public class Fibo {
    public static void main(String[] args) {

        System.out.println(fiboFormula(10));
    }

    static int fiboFormula(int n){
        // just for demo, use long

        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n){

        // base condition
        if (n < 2){
            return n;
        }

        //recursive call
        return fibo(n -1) + fibo(n - 2);
    }
}
