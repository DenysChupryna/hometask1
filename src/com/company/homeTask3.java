package com.company;

import java.util.Scanner;

public class homeTask3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("your number");
        int n = scanner.nextInt();
        int c = n % 2;
        if (c == 0){
            System.out.println("your number is even");
        } else {
            System.out.println("your number is odd");
        }


    }
}
