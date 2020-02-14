package com.kulamarcin;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] tab = new int[n];

        for(int i = 0; i < n; i++)
            tab[i] = scanner.nextInt();

        int negativeSubarrays = 0;

        for(int i = 0; i < tab.length; i++){
            int sum = 0;
            for(int j = i; j < tab.length; j++){
                sum += tab[j];

                if(sum < 0)
                    negativeSubarrays++;
            }
        }

        System.out.println(negativeSubarrays);

    }
}
