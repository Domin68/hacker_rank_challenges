package com.other_package;

import java.util.Arrays;


public class TablicaSuma {
    public static void main(String[] args) {

        int[] atab = new int[5];
        atab[0] = 5;
        atab[1] = 1;
        atab[2] = 3;
        atab[3] = 8;
        atab[4] = 7;
        zwroc(atab);
    }
    // return a sum from all numbers in table
    public static int zwroc(int[] atab){
        System.out.println(Arrays.stream(atab).sum());
        return Arrays.stream(atab).sum();
    }

}
