package com.sda11.ExempleJava;

import java.util.Scanner;

public class HelloWold {
    public static void main(String[] args)
    {
        System.out.println("Hello \tWorld! \"Citat\" \\");
        System.out.println("It's a beautful day for Java!");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
        while (a != 42) {
            System.out.println(a);
            a = input.nextInt();
        }
    }
}
