package com.sda11.ExempleJava;

public class LoopControlFlow
{
    public static void main (String [] args)
    {
        for (int i=5; i>=0;i--)
        {
            for (int j = 0; j <= 5; j++)
            {
                if ( i%3==1 || j%2==1) continue;
                System.out.println("i= " + i + " : j= " + j);
            }
        }

    }

}
