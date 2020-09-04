package com.other_package;

import java.util.Arrays;

public class TabliceDuzaSuma {
    public static void main(String[] args) {
        long[] ar = new long[5];
        ar[0] = 1000000001;
        ar[1] = 1000000002;
        ar[2] = 1000000003;
        ar[3] = 1000000004;
        ar[4] = 1000000005;
        System.out.println(aVeryBigSum(ar));
    }

    static long aVeryBigSum(long[] ar) {

        return Arrays.stream(ar).sum();
    }

}
//5
//1000000001 1000000002 1000000003 1000000004 1000000005