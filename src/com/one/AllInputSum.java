package com.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int sum = 0;
        while(true){
            String input = sc.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try{
                int a = Integer.parseInt(input);
                sum += a;
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please input numbers or 'x' to exit.");
            }
        }
        System.out.println(sum);
    }
}
