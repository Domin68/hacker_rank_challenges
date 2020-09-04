package com.next;

import java.util.Scanner;

public class EoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            System.out.println(s);
        }
    }
}
