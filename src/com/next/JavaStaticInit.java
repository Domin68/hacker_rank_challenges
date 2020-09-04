package com.next;

import java.util.Scanner;

public class JavaStaticInit {
    public static int B;
    public static int H;
    public static boolean flag = flagFlag();

    protected static boolean flagFlag() {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B<1||H<1) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
