package com.company;

public class Comparison {
    public static void main(String[] args) {

        String a = "Kunal";
        String b = "Kunal";

        String c = new String("Kunal");
        String d = new String("kunal");
        System.out.println(c == d);
    }
}
