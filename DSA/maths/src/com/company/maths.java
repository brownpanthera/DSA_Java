package com.company;

public class maths {

    public static void main(String[] args) {

        System.out.println(isPrime(2));
    }

    static boolean isPrime(int n){
        if (n % 2 == 0){
            return false;
        }
        return true;
    }
}
