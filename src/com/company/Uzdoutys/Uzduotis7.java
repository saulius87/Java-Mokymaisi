package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis7 {
    Scanner scanner = new Scanner(System.in);

    int Svoris;
    float Ugis;
    float Kmi;

    public void Ivedimas(){
        System.out.println("Yveskite svory");
        Svoris = scanner.nextInt();
        System.out.println("Yveskite ugi");
        Ugis = scanner.nextFloat();
    }

    public float Kmi(){
        return Kmi = Svoris/(Ugis*2);
    }

    public void Isvedimas(){
        System.out.println("Jusu Kmi indeksas");
        System.out.println(Kmi);
    }

}
