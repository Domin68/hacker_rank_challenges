package com.other_package;

import java.util.Arrays;
import java.util.Scanner;

public class TablicaSuma {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] atab = new int[5];
//        for (int i = 0; i < atab.length; i++) {
//            atab[i] = scanner.nextInt();
//        }
        atab[0] = 5;
        atab[1] = 1;
        atab[2] = 3;
        atab[3] = 8;
        atab[4] = 7;
//        System.out.println(Arrays.stream(atab).sum());
        zwroc(atab);
    }
    public static int zwroc(int[] atab){
        System.out.println(Arrays.stream(atab).sum());
        return Arrays.stream(atab).sum();
    }

}
