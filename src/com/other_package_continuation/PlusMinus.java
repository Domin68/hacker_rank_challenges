package com.other_package_continuation;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4,3,-9,0,4,1};
        plusMinus(arr);
    }
    //shows 5 digits after decimal point
    static void plusMinus(int[] arr) {
    int tabLength = arr.length;
    int plus = 0;
    int minus = 0;
    int zero = 0;
    double wynik1;
    double wynik2;
    double wynik3;
        for (int j : arr) {
            if (j == 0)
                zero++;
            else if (j < 0) {
                minus++;
            } else {
                plus++;
            }
        }
        wynik1 = (double) plus/tabLength;
        wynik2 = (double) minus/tabLength;
        wynik3 = (double) zero/tabLength;
        System.out.printf("%.5g%n", wynik1);
        System.out.printf("%.5g%n", wynik2);
        System.out.printf("%.5g%n", wynik3);
    }
}
/*
* -4 3 -9 0 4 1  */