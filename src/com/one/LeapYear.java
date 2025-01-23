package com.one;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you year: ");
        int year = sc.nextInt();

        if(leapFinder(year)){
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }
    }

    static boolean leapFinder(int year){
        return year % 4 == 0 && year % 100 != 0;
    }
}
