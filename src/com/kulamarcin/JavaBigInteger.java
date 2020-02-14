package com.kulamarcin;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);

        System.out.println(bigIntegerA.add(bigIntegerB));
        System.out.println(bigIntegerA.multiply(bigIntegerB));

    }

}
