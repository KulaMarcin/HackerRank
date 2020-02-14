package com.kulamarcin;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new LinkedList<>();

        for(int i = 0; i < n; i++){
            int value = scanner.nextInt();
            numbers.add(value);
        }

        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            String operation = scanner.next();
            if(operation.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                numbers.add(x, y);
            } else if (operation.equals("Delete")) {
                int z = scanner.nextInt();
                numbers.remove(z);
            }
        }

        for(int x : numbers)
            System.out.print(x + " ");
    }
}
