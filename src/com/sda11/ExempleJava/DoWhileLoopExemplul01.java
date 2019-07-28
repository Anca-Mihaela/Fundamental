package com.sda11.ExempleJava;

import java.util.Scanner;

public class DoWhileLoopExemplul01
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numele");
        String nume= input.nextLine();
        int contor=5;
        do {
            System.out.println(nume);
            contor--;
        }while (contor>0);
        System.out.println("-----------------------------------------");
        contor=5;

        while (contor>0)
        {
            System.out.println(nume);
            contor--;
        }
        System.out.println("-----------------------------------------");
        contor=5;
        do {
            System.out.println(nume);
            contor--;
        }while (contor>6);
        System.out.println("-----------------------------------------");
        contor=5;

        while (contor>6) {
            System.out.println(nume);
            contor--;
        }


    }
}
