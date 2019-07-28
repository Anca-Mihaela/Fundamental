package com.sda11.ExempleJava;

import java.util.Scanner;

public class ExempluSwitchNo01
{
    public static void  main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti o directie");
        String directin = input.nextLine();
        switch (directin)
        {
            case "nord" :
                System.out.println("Mergi spre nord!");
                break;
            case "sud" :
                System.out.println("Mergi spre sud!");
                break;
            case "est" :
                System.out.println("Mergi spre est!");
                break;
            case "vest":
                System.out.println("Mergi spre vest!");
                break;
                default:
                    System.out.println("Nu mergi intr-o directie buna");
        }
    }
}
