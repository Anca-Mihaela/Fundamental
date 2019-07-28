package com.sda11.ExempleJava.Calc;

public class CalcAltCalculator
{
    private int a;
    private int b;

    public CalcAltCalculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public CalcAltCalculator(){}

    public int adunare ()
    {
        return a+b;

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
        this.b = b;
    }
}
