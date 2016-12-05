package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hT7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        int d = (b*b)-(4*a*c);
        System.out.println("D = " + d);

        if (d > 0) {
            double x1 = (-b+sqrt(d)/2*a);
            double x2 = (-b-sqrt(d)/2*a);
            System.out.println("Корни уравнения " + x1 + " " + x2);}

            if (d < 0){
                System.out.println("Корней нет!");}
                if (d == 0){
                    double x3 = (-b)/2*a;
                    System.out.println("Корень уравнения " + x3);
                }

            }


        }



