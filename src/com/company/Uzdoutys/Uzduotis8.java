package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis8 {
    Scanner scanner = new Scanner(System.in);

    public void Sanaudos(){
        System.out.println("Nuvaziuoti km");
        int atstumas = scanner.nextInt();
        System.out.println("Sunaudotas kuras");
        float snaudos = scanner.nextFloat();
        System.out.println("Vidutines kuro sanaudos");
        System.out.println((snaudos*100)/atstumas);

    }
}
