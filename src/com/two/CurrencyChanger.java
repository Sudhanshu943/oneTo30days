package com.two;

import java.util.Scanner;

public class CurrencyChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter indian Rupees('₹'): ");
        double rup = sc.nextDouble();
        System.out.format("Currency in USD is $%.3f\n",toUSD(rup));
    }

    static double toUSD(double n){
        double exchangeRate = 86.18;
        return n/exchangeRate;
    }
}
