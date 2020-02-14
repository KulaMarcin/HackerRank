package com.kulamarcin;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        StringTokenizer tokenizer = new StringTokenizer(s, " !,?._'@");

        int tokens = tokenizer.countTokens();

        System.out.println(tokens);

        while (tokenizer.hasMoreTokens())
        {
            System.out.println(tokenizer.nextToken());
        }

    }

}
