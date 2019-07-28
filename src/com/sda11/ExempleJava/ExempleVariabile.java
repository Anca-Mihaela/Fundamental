package com.sda11.ExempleJava;

import java.util.Scanner;

public class ExempleVariabile {
    public static void main(String[] args) {
        //problema 2

    /*double variabilaDouble;

    Scanner input = new Scanner(System.in);

        System.out.print("Introduceti variabila: ");
    variabilaDouble =input.nextDouble();


        System.out.printf("Valoarea introdusa cu 5 zecimale este %.5f"+
                "ïar cu doua zecimale este %.2f \n",
    variabilaDouble,variabilaDouble);

//problema 3

    int variabila1 = input.nextInt();
    int variabila2 = input.nextInt();
    int variabila3 = input.nextInt();
    int variabila4 = input.nextInt();


    int valoareIntreagal = 1254;
        System.out.printf("Valoare afisata in hexazecimal %x : %x : %x : %x :",variabila1,variabila2,variabila3,variabila4);

    // int valoarea= input.next ();
    {

byte a = 127;
byte b = (byte) 130;
float c = 3.14f;

int d=500;
byte e=(byte) d;
long f=(long) c;

int g= (int) c;

        System.out.println("a= " +a);
        System.out.println("b= "+b);
        System.out.println("f= "+f);
 */
        int a = 100;
        int b = 130;
        int c = 5;

        if ((c < a) && (b > a)) {
            System.out.println("c este mai mic decat a si b este mai mare decat a");
        }
        if ((b > a) || (c > a)) {
            System.out.print("b mai mic decat a iar c nu este mai mic decat a \n");
        }
        if (!(c > a)) {
            System.out.println("c nu este mai mare decat a");
        }
    }
}

