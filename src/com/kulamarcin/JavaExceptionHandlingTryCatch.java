package com.kulamarcin;


import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                int z = x / y;
                System.out.println(z);
            } catch (ArithmeticException ame) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }

        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        }


    }

}
