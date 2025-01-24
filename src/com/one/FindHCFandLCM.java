package com.one;

import java.util.Scanner;

public class FindHCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for HCF and LCM");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = findHCF(a,b);
        int lcm = (a * b) / hcf;

        System.out.format("HCF of number %d and %d is %d\n", a,b,hcf);
        System.out.format("LCM of number %d and %d is %d", a,b,lcm);
    }

    static int findHCF(int a, int b){
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
