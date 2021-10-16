package com.company;

import java.util.ArrayList;

public class array_list {
    public static void main(String[]args){
        // declaration and syntax
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(70);

//     FOR EACH ITERATE
       for(int i : marks){
           System.out.println(i);
       }

//      SIMPLE FOR LOOP ITERATE
        for (int i = 0; i < marks.size(); i++){
            System.out.println(marks.get(i));
        }


    }
}
