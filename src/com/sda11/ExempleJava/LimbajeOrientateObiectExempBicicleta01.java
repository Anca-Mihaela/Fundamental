package com.sda11.ExempleJava;

public class LimbajeOrientateObiectExempBicicleta01
{ public static void main (String [] agrs)
  {
    LimbajeOrientateObiectExempBicicleta bicicletaLuiCostin = new LimbajeOrientateObiectExempBicicleta();

    bicicletaLuiCostin.marca = "Gigant";
    bicicletaLuiCostin.culoarea = "Galben";
    bicicletaLuiCostin.gear = 24;
    bicicletaLuiCostin.speed = 10;

    System.out.println(bicicletaLuiCostin.marca);
    System.out.println(bicicletaLuiCostin.culoarea);
    System.out.println(bicicletaLuiCostin.gear);
    System.out.println(bicicletaLuiCostin.speed);

    System.out.println("------------");
    bicicletaLuiCostin.schimbaViteza();
    System.out.println(bicicletaLuiCostin.gear);
    bicicletaLuiCostin.accelereaza();
    System.out.println(bicicletaLuiCostin.speed);

    LimbajeOrientateObiectExempBicicleta bicicletaLuiCristi = new LimbajeOrientateObiectExempBicicleta();


    bicicletaLuiCristi.marca = "Renault";
    bicicletaLuiCristi.culoarea = "Rosu";
    bicicletaLuiCristi.gear = 0;
    bicicletaLuiCristi.speed = 15;

    System.out.println(bicicletaLuiCristi.marca);
    System.out.println(bicicletaLuiCristi.culoarea);
    System.out.println(bicicletaLuiCristi.gear);
    System.out.println(bicicletaLuiCristi.speed);


    LimbajeOrientateObiectExempBicicleta bicicleta3 = new LimbajeOrientateObiectExempBicicleta("BMX","Rosu" , 24 ,10);
} }
