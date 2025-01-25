package com.two;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0,n2 = 1;
        System.out.print("Enter range for fibonacci series: ");
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        for (int i = 2; i <= n; i++) {
            int fibb = n1 + n2;
            System.out.print(" "+fibb);
            n1 = n2;
            n2 = fibb;
        }
    }
}
