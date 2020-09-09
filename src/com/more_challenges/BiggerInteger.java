package com.more_challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class BiggerInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = new BigInteger("20");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
//Add and multiply huge numbers!
}
