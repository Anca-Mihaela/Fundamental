package com.sda11.ExempleJava;

public class ForLoopExemplul04
{
    public static void main (String [] args)
    {
        int suma=0;
        for (int x=10; x<=30; x++)
        {
            suma=suma+x;
            System.out.println("x= "+x);
            System.out.println("suma= "+suma);
        }
        System.out.println(suma);

    }
}
