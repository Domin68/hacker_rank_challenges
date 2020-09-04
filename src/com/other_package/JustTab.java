package com.other_package;

import java.util.Arrays;

public class JustTab {
    public static void main(String[] args) {
        int[][] mainTab = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        int a = 4;
        int b = 0;
        for (int i = 0; i < a; i++) {
            for (int j = a-1 ; j >=0 ; j--) {
                System.out.println("III " + i);
                System.out.println("JJJ " + j);
            }

        }

        System.out.println(Arrays.stream(mainTab).count());
    }
}
//new int[2][2];