package com.sda11.ExempleJava;

import java.util.Scanner;

public class SimboluriInFunctieDeNumere {
    public static void main (String [] args)
    {
        //problema 2
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar de la 0 la 5:");
        int x = input.nextInt();
        //situatii:
        if (x ==0) System.out.println("*");
        if (x ==1) System.out.println("&");
        if (x ==2) System.out.println("^");
        if (x ==3) System.out.println("%");
        if (x ==4) System.out.println("$");
        if (x ==5) System.out.println("#");

        System.out.println( "\n\n Toate bune!");
    }
}
