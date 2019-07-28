package com.sda11.ExempleJava;

import java.util.Scanner;

public class LoopControlFlowProblema02
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String cuvant = "";
        while (!cuvant.equals("quit"))
        {
            cuvant = input.nextLine();
            if (cuvant.equals("continue")) continue;
            System.out.println(cuvant);

        }
}}
