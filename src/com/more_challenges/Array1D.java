package com.more_challenges;

import java.util.Scanner;
//simple program to read an array of integers from user and print it

public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            n = sc.nextInt();
            a[i] = n;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
