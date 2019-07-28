package com.sda11.ExempleJava;

public class CalculatorExemplul01
{
    public static void main(String [] args)
    {
        Calculator calc= new Calculator(  5,  7);
        Calculator calc2= new Calculator(10, 18);

        int rezultatAdunare;
        int rezultatScadere;
        int rezultatInmultire;
        int rezultatImpartire;
        int rezultatCumulat;

        rezultatAdunare = calc.adunare();
        System.out.println("Rezultatul adunarii lui " + calc.a + " cu " + calc.b + " este: " + rezultatAdunare);

        rezultatCumulat = calc2.adunare();
        System.out.println("Rezultatul adunarii lui " + calc2.a + " cu " + calc2.b + " este " + rezultatCumulat);

        System.out.println("Rezultatul adunarii celor doua rezultate anterioare este: " + (rezultatAdunare+rezultatCumulat));

        rezultatScadere = calc.scaderea();
        System.out.println("Rezultatul scaderii lui " + calc.a + " cu " + calc.b + " este: " + rezultatScadere);

        rezultatInmultire = calc.inmultire();
        System.out.println("Rezultatul inmultirii lui " + calc.a + " cu " + calc.b + " este: " + rezultatInmultire);

        rezultatImpartire = calc.impartire();
        System.out.println("Rezultatul impartirii lui " + calc.a + " cu " + calc.b + " este: " + rezultatImpartire);

        calc.calculeazaAriaDreptunghiului(10,10);
        System.out.println("Aria dreptunghiului este: " + calc.ariadeptunghi);

        //privat
        calc.setA(12);
        calc.setB(17);

        System.out.println("a= " + calc.getA());
        System.out.println("b= " + calc.getB());

        rezultatImpartire=calc.impartire();
        System.out.println("Rezultaul adunarii lui 12 si 15 este: " + rezultatAdunare);
    }
}
