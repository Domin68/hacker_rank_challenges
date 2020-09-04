package com.other_package_continuation;

import java.util.Arrays;

public class BirthdayCandles {
    public static void main(String[] args) {
        int[] ar = {3, 3, 1, 2, 3, 3, 3, 3};
        birthdayCakeCandles(ar);
    }

    static int birthdayCakeCandles(int[] ar) {
        int height = Arrays.stream(ar).max().getAsInt();
        int count = 0;
        for (int i : ar) {
            if (i == height) {
                count++;
            }
        }
        return count;
    }
}
