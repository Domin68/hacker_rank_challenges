package com.next;

import java.util.*;

class MorePractice {
    public static void main(String[] argh) {
    isPalindrome();

    }
    public static boolean isPalindrome(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numb = String.valueOf(num);
        StringBuilder sb = new StringBuilder(numb);
        String numb2 = sb.reverse().toString();
        System.out.println("numb:  " + numb);
        System.out.println("sb.rev: " + sb.reverse());
        System.out.println("bool " + numb.equals(numb2));
        return numb.equals(sb.reverse().toString());
    }
}

//5
//-150
//150000
//1500000000
//213333333333333333333333333333333333
//-100000000000000

//-150 can be fitted in:
//* short
//* int
//* long
//150000 can be fitted in:
//* int
//* long
//1500000000 can be fitted in:
//* int
//* long
//213333333333333333333333333333333333 can't be fitted anywhere.
//-100000000000000 can be fitted in:
//* long