package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis9 {
    Scanner scanner = new Scanner(System.in);
    int Atstuumas;
    float Sanaudos;

    public void Ivedimas(){
        System.out.println("Yveskite nuvaziuota atstuma");
        Atstuumas = scanner.nextInt();
        System.out.println("Yveskite degalu sanaudas");
        Sanaudos = scanner.nextFloat();

    }

    public void Vidutinis(){
        System.out.println((Sanaudos*100)/Atstuumas);
    }
}
