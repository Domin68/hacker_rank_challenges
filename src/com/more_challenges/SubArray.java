package com.more_challenges;

import java.util.Arrays;
// count all of negative numbers and sums from all possible subarrays composed from a contiguous block of the original array's elements.

public class SubArray {
    public static void main(String[] args) {
        int[] A = {1, -2, 4, -5, 1};
        int negativeSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if ((j - i +1) < 1){continue;}
                int[] subArr = new int[j - i +1];
                System.arraycopy(A, i,subArr,0,subArr.length);
                int subAVal = Arrays.stream(subArr).sum();
                if (subAVal<0){negativeSum++;}
                System.out.println(Arrays.toString(subArr));
            }
        }
        System.out.println(negativeSum);
    }
}
