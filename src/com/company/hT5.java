package com.company;

import java.util.Scanner;

public class hT5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("your number one");
        int n = scanner.nextInt();
        System.out.println("your number two");
        int m = scanner.nextInt();
        int dif1 = 10 - n;
        int dif2 = 10 - m;
        if (dif1>dif2){
            System.out.println("number two ближе к 10");
        } if (dif1<dif2){
            System.out.println("number one ближе к 10");
        } if (dif1==dif2){
            System.out.println("числа равны");
        }
    }
}
