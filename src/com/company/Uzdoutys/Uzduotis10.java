package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis10 {
    Scanner scanner = new Scanner(System.in);

    int pirmas;
    int antras;

    public void Ivedimas(){
        System.out.println("Yveskite pirmaji skaiciu");
        pirmas = scanner.nextInt();

        System.out.println("Yveskite antraji skaiciu");
        antras = scanner.nextInt();
    }
    public void Veiksmai(){
        suma(pirmas,antras);
        skirtumas(pirmas, antras);
        sandauga(pirmas, antras);
    }

    public static void suma(int pirmas, int antras){
        System.out.println("Suma");
        System.out.println(pirmas + antras);
    }
    public static void skirtumas(int pirmas, int antras){
        System.out.println("Suma");
        System.out.println(pirmas - antras);
    }
    public static void sandauga(int pirmas, int antras){
        System.out.println("Suma");
        System.out.println(pirmas * antras);
    }



}
