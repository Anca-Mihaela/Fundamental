package com.sda11.ExempleJava;

public class Calculator
{
    int a;
    int b;
    int ariadeptunghi;

    public Calculator (int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public int adunare ()
    {
        return  a+b;
    }
    public int scaderea ()
    {
        if ( a>b)
        {
            return a - b;
        }
        else if (b>a)
            {
            return  b-a;
            }
        else
        {
            return 0;
        }

    }
    public int inmultire ()
    {
        return a*b;
    }
    public int impartire ()
    {
        return  a/b;
    }
    public void  calculeazaAriaDreptunghiului(int laturaMica, int laruraMare)
    {
        ariadeptunghi=laturaMica*laruraMare;

    }
    public int getA()
    {
        return a;

    }
    public void setA(int a)
    {
        this.a = a;
    }
    public int getB()
    {
        return b;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public  int getAriadeptunghi()
    {
        return ariadeptunghi;
    }

    public void setAriadeptunghi(int ariadeptunghi)
    {
        this.ariadeptunghi = ariadeptunghi;
    }
}
