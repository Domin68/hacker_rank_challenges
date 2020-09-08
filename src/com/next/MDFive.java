package com.next;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MDFive {
    //Message Digest 5 encryption
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
