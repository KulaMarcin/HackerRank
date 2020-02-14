package com.kulamarcin;

import java.util.Scanner;
import java.util.regex.Pattern;

public class patternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        for(int i = 0; i < testCases; i++) {
            String pattern = in.nextLine();

            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }

}
