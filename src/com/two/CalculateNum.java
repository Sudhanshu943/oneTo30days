package com.two;

import java.util.Objects;
import java.util.Scanner;

public class CalculateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Enter an operator: ");
        String c = sc.next();

        if (Objects.equals(c, "+")){
            int add = n1 + n2;
            System.out.format("Sum of %d and %d is %d",n1,n2,add);
        } else if (Objects.equals(c,"-")) {
            int subtract = n1 - n2;
            System.out.format("Subtract of %d and %d is %d",n1,n2,subtract);
        } else if (Objects.equals(c,"*")) {
            int multiply = n1 * n2;
            System.out.format("Multiply of %d and %d is %d",n1,n2,multiply);
        } else if (Objects.equals(c,"/")) {
            if (n2 == 0) {
                System.out.println("Can't divide by 0");
            }else {
                double divide = (double) n1 /n2;
                System.out.format("Division of %d and %d is %f",n1,n2,divide);
            }
        }
    }
}
