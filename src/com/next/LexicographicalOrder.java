package com.next;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LexicographicalOrder {
    public static void main(String[] args) {
        String A = "welcometojava";
        String[] stab = new String[A.length()-2];
        String smallest = "";
        String largest = "";
        int k = 3;
        int numb = A.length()%k+1;
        for (int i = 0; i < A.length()-numb; i++) {
            stab[i] = A.substring(i, k);
            k++;
        }
        stab = Stream.of(stab).sorted().toArray(String[]::new);
        smallest =stab[stab.length-1] ;
        largest =stab[0] ;
    }
}
