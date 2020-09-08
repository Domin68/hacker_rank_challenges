package com.next;

import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation pf = a -> a % 2 == 0;

    PerformOperation isOdd() {
        return pf;
    }

    PerformOperation pf2 = a -> {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count == 2;
    };

    PerformOperation isPrime() {
        return pf2;
    }
    PerformOperation pf3 = a -> {
        String numb = String.valueOf(a);
        StringBuilder sb = new StringBuilder(numb);
        String numb2 = sb.reverse().toString();
        return numb.equals(numb2);
    };

    PerformOperation isPalindrome() {
        return pf3;
    }


}

public class LambdaPractice {
//program check if number is odd or even, prime or composite nad palindrome
    public static void main(String[] args) {
        MyMath ob = new MyMath();
        Scanner scan = new Scanner(System.in);
        int T = 1;
        PerformOperation op;
        boolean ret;
        String ans = null;
        while (T-- > 0) {
            int ch = scan.nextInt();
            int num = scan.nextInt();
            if (ch == 1) {
                op = ob.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

