package com.sda11.ExempleJava;

import java.util.Scanner;

public class InstructiuneaSwichStatement
{
    public static void  main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti o directie");
        char direction = input.next().charAt(0);
        switch (direction)
        { case 'n':
                System.out.println( "You are going North!");
                break;
            case 's':
                System.out.println("You are going South!");
                break;
            case 'e':
                System.out.println("You are going East!");
                break;
            case 'w':
                System.out.println("You are going West!");
                break;
                default:
                    System.out.println("Bad direction");

        }
    }
}
