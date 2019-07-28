package com.sda11.ExempleJava;

import java.util.Scanner;

public class BucleExemplul04
{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String cuvinte;
        while (4 == 4) {
            cuvinte = input.nextLine();
            System.out.println(cuvinte);
            if (cuvinte.equals("oprit")) break;
        }


    }
}
