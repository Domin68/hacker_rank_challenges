package com.other_package_continuation;

import java.util.Arrays;

public class MiniMaxiSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] arr2 = {254961783 ,604179258 ,462517083 ,967304281 ,860273491};
        miniMaxSum(arr2);
    }
    // sum the array with big numbers and return max and min value from the array
    static void miniMaxSum(int[] arr) {
        long[] longTab = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            longTab[i] = arr[i];
        }
        long max = Arrays.stream(longTab).sum() - Arrays.stream(longTab).max().getAsLong();
        long min = Arrays.stream(longTab).sum() - Arrays.stream(longTab).min().getAsLong();
        System.out.println(max+"  "+min);
    }
}
