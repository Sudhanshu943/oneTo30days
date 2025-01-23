package com.one;

import java.util.Scanner;

public class TwoNumsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = sc.nextInt() , b = sc.nextInt();
        int ans = add(a,b);
        System.out.format("Sum of %d & %d is %d ",a,b, ans);
    }

    static int add(int a, int b){
        return a+b;
    }
}
