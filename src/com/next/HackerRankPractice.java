package com.next;

import java.util.Scanner;

public class HackerRankPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = 0;
            for (int j = 0; j < n; j++) {
                int c = (b * x);
                System.out.print(a + b + c + " ");
                x += 2;
                x *= 2;
                x -= 2;
            }
            System.out.println();
        }

    }
}
// 0+ 1*2 = 2
// 0+ 1*2 + 2*2 = 6
// 0+ 1*2 + 2*2 + 4*2 = 14

//0 2 10
//5 3 5
/*
 * 5+ 1*3 =8
 * 5+ 1*3 +2*3 =14
 * 5+ 1*3 +2*3 + 4*3 =26
 * 5+ 1*3 +2*3 + 4*3 + 8*3 =50
 * 5+ 1*3 +2*3 + 4*3 + 8*3 + 16*3 =98
 *
 * */