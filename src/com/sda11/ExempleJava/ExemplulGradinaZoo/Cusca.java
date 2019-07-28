package com.sda11.ExempleJava.ExemplulGradinaZoo;

public class Cusca

{
    private int lungime;
    private int latime;
    private static int numarCusti;

    private Animal animal;
    public Cusca (int l, int L, Animal a){
        this.lungime=L;
        this.latime=l;
        this.animal=a;
        numarCusti++;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public static int getNumarCusti() {
        return numarCusti;
    }

    public static void setNumarCusti(int numarCusti) {
        Cusca.numarCusti = numarCusti;
    }
}
