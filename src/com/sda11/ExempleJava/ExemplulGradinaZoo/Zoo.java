package com.sda11.ExempleJava.ExemplulGradinaZoo;

import java.util.Scanner;

public class Zoo
{
    public static void main(String [] agrs)
    {
        Scanner input = new Scanner(System.in);
        int hrana;
        int i;

        Animal urs= new Animal("Carpatin", 1, "Martin", 50.5);
        Animal caprioara= new Animal("Neagra", 2,"Marta", 42.8);
        Animal cocos= new Animal("Munte", 3, "Saky", 1.8);

        Cusca cusca1 = new Cusca(6,8, urs);
        System.out.println(Cusca.getNumarCusti());
        Cusca cusca2 = new Cusca(50,40, caprioara);
        System.out.println(Cusca.getNumarCusti());
        Cusca cusca3 = new Cusca(3,2, cocos);
        System.out.println(Cusca.getNumarCusti());


        System.out.println("Decate ori hranesti ursul?");
        hrana = input.nextInt();
        for (i=0; i<hrana; i++)
        {
            urs.hranire();
        }
        System.out.println("Greutatea ursului este: " + urs.getGreutate() + "kg.");

        System.out.println("\nDe cate ori hranesti caprioara");
        hrana = input.nextInt();
        for (i=0; i<hrana; i++)
        {
            caprioara.hranire();
        }
        System.out.println("Greutatea caprioarei este: " + caprioara.getGreutate() + "kg.");

        System.out.println("\nDecate ori hranesti cocos? ");
        hrana = input.nextInt();
        for (i=0; i<hrana; i++)
        {
            cocos.hranire();
        }
        System.out.println("Greutatea cocosului este: " + cocos.getGreutate() + "kg.");
    }


}
