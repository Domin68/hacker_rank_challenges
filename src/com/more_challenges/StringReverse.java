package com.more_challenges;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        String A2 = sb.reverse().toString();
        if (A2.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
