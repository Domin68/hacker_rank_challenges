package com.next;

public class BreakingRecords {
    public static void main(String[] args) {
//        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        breakingRecords(scores);
    }
    // method breakingRecords shows how often the highest value and lowest value occur in tab

    static int[] breakingRecords(int[] scores) {
        int win = 0;
        int lose = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                win++;
                max = scores[i];
            } else if (scores[i] < min) {
                lose++;
                min = scores[i];

            }
        }
        System.out.println(win + "  " + lose);
        int[] tab = {win,lose};
        return tab;
    }
}
//10
//3 4 21 36 10 28 35 5 24 42