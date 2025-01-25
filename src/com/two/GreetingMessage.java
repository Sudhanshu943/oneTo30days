package com.two;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = sc.nextLine();
        message(name);

    }

    static void message(String name){
        String message = "Greeting's ";
        System.out.format(message+name+". Have a nice day.");
    }
}
