package com.kulamarcin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> listOfArrays = new ArrayList<>();

        int lines = scanner.nextInt();

        for(int i = 0; i < lines; i++){
            int itemsInLine = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < itemsInLine; j++){
                list.add(scanner.nextInt());
            }
            listOfArrays.add(list);
        }

        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(listOfArrays.get(x-1).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }


        }

    }

}
