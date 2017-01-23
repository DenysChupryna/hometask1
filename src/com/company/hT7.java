package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hT7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        System.out.println("c = ");
        double c = scanner.nextDouble();
        double d = (b * b) - (4 * a * c);
        System.out.println("D = " + d);

        if (d > 0) {
            double x1 = (-b + sqrt(d) / 2 * a);
            double x2 = (-b - sqrt(d) / 2 * a);
            System.out.println("Корни уравнения " + x1 + " и " + x2);

        } else if (d == 0) {
            double x3 = (-b) / 2 * a;
            System.out.println("Корень уравнения " + x3);

        } else {
            System.out.println("Корней нет!");
        }
    }
}






