package com.company;

import java.util.Scanner;

public class Palindrome {
    int x, sum = 0;

    int palindrome(int x) {
        if (x <= 0) {
            return 0;
        } else {
            sum = (sum * 10) + x % 10;
            return palindrome(x / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int temp = x;
        Palindrome p = new Palindrome();
        p.palindrome(x);
        if (p.sum == temp) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
