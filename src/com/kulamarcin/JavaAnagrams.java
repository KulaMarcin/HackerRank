package com.kulamarcin;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {

        char[] charArrayA = a.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArrayB = b.replaceAll("\\s", "").toLowerCase().toCharArray();

        int xor = 0;

        if(charArrayA.length != charArrayB.length)
            return false;

        for(int i = 0; i < charArrayA.length; i++)
            xor ^= charArrayA[i] ^ charArrayB[i];

        return xor == 0 ? true : false;

    }

    public static void main(String [] args) {

        String a = "anagramm";
        String b = "marganaa";

        if(isAnagram(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }

}
