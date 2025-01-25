package com.two;

import java.util.Scanner;

public class FindSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextInt();
        System.out.print("Enter Rate: ");
        double rate = sc.nextInt();
        System.out.print("Enter Time: ");
        double time = sc.nextInt();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: "+simpleInterest);


    }
}
