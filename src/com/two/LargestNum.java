package com.two;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.format("Largest Number between %d and %d is %d",a,b,largestNumber(a,b));
    }

    static int largestNumber(int a, int b){
        int max = a;
        if (max < b) {
            max = b;
        }
        return max;
    }
}
