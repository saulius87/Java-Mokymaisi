package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzdoutis3 {
    Scanner scaneris = new Scanner(System.in);

    public void SumaSkirtumas(){
        System.out.println("Yveskite pirma sveika skaiciu");
        int pirmas = scaneris.nextInt();

        System.out.println("Yveskite antra sveika skaiciu");
        int antra = scaneris.nextInt();

        System.out.println("Skaiciu suma");
        System.out.println(pirmas + antra);
        System.out.println("Skaiciu skirtumas");
        System.out.println((pirmas-antra));


    }
}
