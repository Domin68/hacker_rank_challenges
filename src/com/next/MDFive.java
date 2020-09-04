package com.next;

import javax.xml.datatype.DatatypeFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MDFive {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s = "HelloWorld";
        MessageDigest ms = new MessageDigest("MD5") {
            @Override
            protected void engineUpdate(byte input) {

            }

            @Override
            protected void engineUpdate(byte[] input, int offset, int len) {

            }

            @Override
            protected byte[] engineDigest() {
                return new byte[0];
            }

            @Override
            protected void engineReset() {

            }
        };
        ms.update(s.getBytes());
        byte[] digest = ms.digest();
        byte[] myHash = s.getBytes();
        ms.update(myHash);
        ms.digest(myHash);
        System.out.println(Arrays.toString(myHash));
        System.out.println(ms);
        System.out.println(Arrays.toString(digest));
    }
}
