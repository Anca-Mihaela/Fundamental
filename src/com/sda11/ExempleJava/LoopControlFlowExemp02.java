package com.sda11.ExempleJava;

public class LoopControlFlowExemp02
{
    public static void main (String [] args)
{
    {
        for (int j = 0; j <= 5; j++)
        {
            if ( j%2==1) continue;
            System.out.println(" j= " + j);
        }
    }

}
}