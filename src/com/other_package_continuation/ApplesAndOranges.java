package com.other_package_continuation;

public class ApplesAndOranges {
    public static void main(String[] args) {
        int s = 7, t = 11, a = 5, b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int m = 0;
        int n = 0;
        for (int ap : apples) {
            if (a + ap >= s && a + ap <= t) {
                m++;
            }
        }
        for (int or : oranges){
            if (b + or >= s && b + or <= t){
                n++;
            }
        }
        System.out.println(m);
        System.out.println(n);
    }
}
/*
7 11 s t
5 15 a b
3 2 m (apple quantity) n (orange quantity)
-2 2 1 tab distance apple
5 -6 tab distance orange

    s-t: Sam's house,
    a Apple tree,
    b Orange tree,
    apples: integer array, distances at which each apple falls from the tree.
    oranges: integer array, distances at which each orange falls from the tree.

    Input Format

The first line contains two space-separated integers denoting the respective values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
The third line contains two space-separated integers denoting the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

 */