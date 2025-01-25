package com.two;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        if (checkPalindrome(str)) {
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
    }

    static boolean checkPalindrome(String s){
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >=0 ; i--) {
            rev.append(s.charAt(i));
        }
        return s.contentEquals(rev);
    }
}
