package com.two;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (OddEven(num) == -1){
            System.out.format("Number %d is Odd Number",num);
        }else{
            System.out.format("Number %d is Even Number",num);
        }
    }

    static int OddEven(int n){
        if (n % 2 != 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
