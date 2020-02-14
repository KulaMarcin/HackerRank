package com.kulamarcin;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        char[] charArray = A.toCharArray();

        for(int i = 0; i < charArray.length/2; i++) {
            char bufor = charArray[i];
            charArray[i] = charArray[charArray.length-i-1];
            charArray[charArray.length-i-1] = bufor;
        }

        String B = new String(charArray);

        if(B.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
