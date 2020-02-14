package com.kulamarcin;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMd5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] hash = messageDigest.digest(text.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();

        for(byte b : hash)
            sb.append(String.format("%02x", b));

        System.out.println(sb.toString());

    }

}
