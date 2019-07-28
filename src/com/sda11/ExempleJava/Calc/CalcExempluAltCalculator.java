package com.sda11.ExempleJava.Calc;

import java.util.Scanner;

public class CalcExempluAltCalculator
{
    public static void main(String[] args)
    {
        CalcAltCalculator ac = new CalcAltCalculator();
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Introduceti a: ");
        a=input.nextInt();

        System.out.println("Introduceti b: ");
        b=input.nextInt();

        ac.setA(a);
        ac.setB(b);

        int rezultat;

        rezultat= ac.adunare();
        System.out.println("Rezultatul adunarii este: " + rezultat);


    }
}
