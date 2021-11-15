package com.company;

public class Main {

    public static void main(String[] args) {

        pattern2(4);
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            // for every row run the column
            for (int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
