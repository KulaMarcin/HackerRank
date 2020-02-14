package com.kulamarcin;



import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyFormatterIndia = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat currencyFormatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + currencyFormatterUs.format(payment));
        System.out.println("India: " + currencyFormatterIndia.format(payment));
        System.out.println("China: " + currencyFormatterChina.format(payment));
        System.out.println("France: " + currencyFormatterFrance.format(payment));

    }

}
