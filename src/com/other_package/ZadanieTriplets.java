package com.other_package;

import java.util.ArrayList;
import java.util.List;

public class ZadanieTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0));
        System.out.println(result.get(1));

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ab = new ArrayList<>();
        int count=0;
        int count2=0;
        for (int i = 0; i < a.size(); i++) {
            if(!a.get(i).equals(b.get(i)))
            if (a.get(i) > b.get(i)) {
                count++;
            } else
                count2++;
        }
        ab.add(0,count);
        ab.add(1,count2);
        return ab;
    }
}
//5 6 7
//3 6 10
//17 28 30
//99 16 8