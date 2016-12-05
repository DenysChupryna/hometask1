package com.company;


import java.util.Scanner;

public class hT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your number");
        String number = scanner.next();
        char c0 = number.charAt(0);
        char c1 = number.charAt(1);
        int i0 = Character.getNumericValue(c0);
        int i1 = Character.getNumericValue(c1);
        System.out.println(i0+i1);



    }
}
