package com.next;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        payment *= 100;
        payment = Math.round(payment);
        payment /= 100;

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = nf.format(payment);
        String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
//12324,134

//US: $12,324.13
//India: Rs.12,324.13
//China: ￥12,324.13
//France: 12 324,13 €
//Given a double-precision number, ,
// denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert into the
// US, Indian, Chinese, and French currency formats. Then print the formatted values as follows: