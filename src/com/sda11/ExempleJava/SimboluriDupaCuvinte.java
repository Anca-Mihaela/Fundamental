package com.sda11.ExempleJava;

import java.util.Scanner;

public class SimboluriDupaCuvinte {
    public static void  main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        if (text.equals("dolar"))
            System.out.println("$");
        if (text.equals("star"))
            System.out.println("*");
        if (text.equals("plus"))
            System.out.println("+");
        if (text.equals("arond"))
            System.out.println("@");
    }
}
