package com.three;

import java.util.Scanner;

public class ProSumSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        numProSum(num);
    }

    static void numProSum(int n){
        int pro = 1;
        int sum = 0;
        int number = n;
        while(n>0){
            int temp = n%10;
            pro *= temp;
            sum += temp;
            n = n/10;
        }
        System.out.format("%d's Digits product is %d, Sum is %d\nSubtraction of number's Product and Sum is %d ",number,pro,sum,pro-sum);
    }
}
