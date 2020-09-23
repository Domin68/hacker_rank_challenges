package com.more_challenges;

import java.math.BigDecimal;
import java.util.*;

public class BiggerDecimal {
    // input is a String table with decimal numbers in various forms
    // and a challenge is to sort it with exact same values as in input
    public static void main(String[] args) {
        List<BigDecimal> decimalList = new ArrayList<>();
        Map<BigDecimal, String> mapToCopy = new HashMap<>();
        String[] s = new String[11];
        s[0] = "-100";
        s[1] = "50";
        s[2] = "0";
        s[3] = "56.6";
        s[4] = "90";
        s[5] = "0.12";
        s[6] = ".12";
        s[7] = "02.34";
        s[8] = "000.000";
        s[9] = null;
        s[10] = null;
        String[] s2 = new String[9];
        for (int i = 0; i < s2.length; i++) {
            s2[i] = s[i];
        }
        try {
            for (String es : s2) {
                decimalList.add(new BigDecimal(es));
            }
            for (int i = 0; i < s2.length; i++) {
                mapToCopy.put(decimalList.get(i), s2[i]);
            }
            decimalList.sort(Comparator.reverseOrder());
            for (int i = 0; i < s2.length; i++) {
                s2[i] = mapToCopy.get(decimalList.get(i));
            }
            for (BigDecimal bd: decimalList) {
                System.out.println(bd);
            }
            s = s2;
//            for (String sss : s) {
//                System.out.println(sss);
//            }
        } catch (NullPointerException e) {
            System.out.println("SomethingWentWrong");
        }

    }
}
//-100
//50
//0
//56.6
//90
//0.12
//.12
//02.34
//000.000
