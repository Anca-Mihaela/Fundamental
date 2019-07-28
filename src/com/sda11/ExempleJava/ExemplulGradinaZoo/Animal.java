package com.sda11.ExempleJava.ExemplulGradinaZoo;

public class Animal
{
   private String specie;
   private int varsta;
   private String nume;
   private double greutate;

   public Animal (String s, int v, String n, double g)
   {
       this.specie = s;
       this.varsta = v;
       this.nume = n;
       this.greutate = g;
   }
   public void hranire ()
   {
       greutate = greutate * 1.005;

   }

    public String getSpecie()
    {
        return specie;
    }

    public int getVarsta()
    {
        return varsta;
    }

    public String getNume()
    {
        return nume;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

}
