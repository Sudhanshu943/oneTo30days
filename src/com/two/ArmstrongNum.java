package com.two;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        int start = sc.nextInt();
        System.out.print("Enter ending point: ");
        int end = sc.nextInt();
        isArmstrong(start,end);
    }

    static void isArmstrong(int start, int end){
        for (int i = start; i <= end; i++) {
            int num = i, rem, digit = 0, sum = 0;
            digit = (int) Math.log10(num) + 1;
            while (num > 0) {
                rem = num % 10;
                sum = sum + (int) Math.pow(rem, digit);
                num = num / 10;
            }
            if (i == sum) {
                System.out.print(i+" ");
            }
        }
    }
}
