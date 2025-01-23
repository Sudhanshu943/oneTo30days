package com.one;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();
        System.out.format("Multiplication of Number %d is\n",num);

        for (int i = 1; i <= 10; i++) {
            int a = num * i;
            System.out.format("%d * %d = %d\n",num,i,a);
        }
    }
}
