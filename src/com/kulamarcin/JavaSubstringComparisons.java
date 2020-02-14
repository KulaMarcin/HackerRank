package com.kulamarcin;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(s.length()-k, s.length());

        for(int i = 0; i <= s.length()-k; i++){

            String fragment = s.substring(i, i+k);

            if(smallest.compareTo(fragment) > 0)
                smallest = fragment;
            if(largest.compareTo(fragment) < 0)
                largest = fragment;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String [] args) {

        System.out.println(getSmallestAndLargest("welcometojava", 3));

    }


}
