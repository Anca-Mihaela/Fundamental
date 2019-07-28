package com.sda11.ExempleJava;

import java.util.Scanner;

public class BucleExemplul05
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        String text=input.nextLine();

        int i=text.length();
        while (i>0)
        {
            System.out.print(text.charAt(i-1));
            i--;

    } }}

