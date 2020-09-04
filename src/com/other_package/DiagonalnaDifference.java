package com.other_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalnaDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr0 = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> arr3 = new ArrayList<>();
        arr.add(arr0);
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        arr0.add(11);
        arr0.add(2);
        arr0.add(4);
        arr0.add(5);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(9);
        arr2.add(10);
        arr2.add(8);
        arr2.add(-12);
        arr3.add(12);
        arr3.add(6);
        arr3.add(3);
        arr3.add(1);
        System.out.println(diagonalDifference(arr));
//        System.out.println(Arrays.stream(arr.toArray()).count());
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sizeOfMainList = (int)Arrays.stream(arr.toArray()).count();
        int count = 0;
        int number1 = 0;
        int number2 = 0;
            for (int j = sizeOfMainList-1; j >= 0 ; j--) {
                number1 += arr.get(count).get(count);
                number2 += arr.get(count).get(j);
                count++;
            }
        return Math.abs(number1-number2);
    }
}
/* 11  2   4   5
   4   5   6   9
   10  8  -12  3
   12  6   3   1

   5 - 31 = -26


*/