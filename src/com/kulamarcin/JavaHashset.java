package com.kulamarcin;

import java.util.*;

public class JavaHashset {

    public static void main(String [] args) {

        Set<String> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        for(int i = 0; i < t; i++) {
            StringBuilder pair = new StringBuilder();
            pair.append(pair_left[i]).append(" ").append(pair_right[i]);
            set.add(pair.toString());
            System.out.println(set.size());
        }
    }

}
