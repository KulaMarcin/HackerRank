package com.kulamarcin;

class Printer
{

    <T> void printArray(T[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}

public class JavaGenerics {

    public static void main( String [] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;


    }

}
