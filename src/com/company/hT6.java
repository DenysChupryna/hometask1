package com.company;


import java.util.Scanner;
import static java.lang.Math.*;

public class hT6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("катет a");
        int catet1 = scanner.nextInt();
        System.out.println("катет b");
        int catet2 = scanner.nextInt();
        int square = (catet1*catet2)/2;
        System.out.println("площадь равна " + square);
        double gippo = sqrt((catet1^2)+(catet2^2));
        System.out.println("гипотенуза = " + gippo);
        double perimetr = catet1+catet2+gippo;
        System.out.println("периметр = " + perimetr);




    }
}
