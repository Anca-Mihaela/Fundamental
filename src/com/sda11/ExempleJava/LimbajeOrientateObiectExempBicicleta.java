package com.sda11.ExempleJava;

public class LimbajeOrientateObiectExempBicicleta
{
    public  int gear;
    public String marca;
    public double speed;
    public String culoarea;


    public LimbajeOrientateObiectExempBicicleta ( String m, String c, int g, double s){
        this.gear=g;
        this.marca=m;
        this.speed=s;
        this.culoarea=c;
    }
    public LimbajeOrientateObiectExempBicicleta (){}
    public void schimbaViteza()
    {
        if (gear < 24) gear++;
        else gear--;
    }
    public void accelereaza ()
    {
        speed = speed * 1.1;
    }
}
