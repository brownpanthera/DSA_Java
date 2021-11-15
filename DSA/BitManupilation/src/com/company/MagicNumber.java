package com.company;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;

        int base = 5;
        while (n > 0){
            int last = n & 1;
             n = n >> 1;
             ans += last * base;
             base = base * 5;
        }

        System.out.println(ans);
    }
}

// Magic Number =>  convert it into Binary than add the value that is 1 with the power of 5 and power
// of 5 will be start at 1

// write given number in binary and take the addition of the power of 5