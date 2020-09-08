package com.more_challenges;


public class Anagrams {
    public static void main(String[] args) {
        isAnagram("Hello","LLeho");
    }
    public static void sortCharArr(char[] ch){
        int size,temp;
        size = ch.length;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(ch[i]>ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = (char) temp;
                }
            }
        }
    }
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] wordA = a.toCharArray();
        char[] wordB = b.toCharArray();
        sortCharArr(wordA);
        sortCharArr(wordB);
        String sortedA = String.copyValueOf(wordA);
        String sortedB = String.copyValueOf(wordB);
        return sortedA.equals(sortedB);
    }
}
