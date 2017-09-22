package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis6 {
    Scanner scanner = new Scanner(System.in);
    int svoris;
    float ugis;


    public void Ivedimas(){
       System.out.println("Yveskite svori");
       svoris = scanner.nextInt();
       System.out.println("Yveskite ugy");
       ugis = scanner.nextFloat();
    }
    public void Kmi(){
        float Kmi = svoris/(ugis*2);
        System.out.println("Jusu Kmi indesas");
        System.out.println(Kmi);
    }
}
