package com.company;


import java.util.Scanner;
import static java.lang.Math.*;

public class hT6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("катет a");
        int a = scanner.nextInt();
        System.out.println("катет b");
        int b = scanner.nextInt();
        int s = (a*b)/2;
        System.out.println("площадь равна " + s);
        int c = sqrt((a^2)+(b^2));


    }
}
