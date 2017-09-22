package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis4 {
    Scanner scanner = new Scanner(System.in);

    int pirmas;
    int antras;

    public void Ivedimas(){
        System.out.println("Yveskite pirma skaiciu");
        pirmas = scanner.nextInt();

        System.out.println("Yveskite antras skaiciu");
        antras = scanner.nextInt();
    }

    public void Suma(){
        System.out.println("Skaiciu suma");
        System.out.println(pirmas+antras);
    }

    public void Skirtumas(){
        System.out.println("Skaiciu skirtumas");
        System.out.println(pirmas-antras);
    }
}
