package com.company;

public class pattern1 {
    public static void main(String[]args){

        pattern1(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            // for every row run the column
            for (int column = 1; column <= n; column++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
