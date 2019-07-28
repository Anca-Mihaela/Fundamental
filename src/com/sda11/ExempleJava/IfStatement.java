package com.sda11.ExempleJava;

import java.util.Scanner;

public class IfStatement {
    public static void main (String[]args){

        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if (age<18) {
            System.out.println("You are teeanager!");
        } else if (age>100) {
            System.out.println("You are very old!");
        } else {
                System.out.println("You are adult!");
        }
    }
}
