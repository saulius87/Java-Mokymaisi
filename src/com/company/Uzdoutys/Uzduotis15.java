package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis15 {

    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    float Plotas;

    public void Ivedimas(){
        System.out.println("Yveskite pirma skaiciu");
        a= scanner.nextInt();
        System.out.println("Yveskite antra skaiciu");
        b = scanner.nextInt();
    }


    public void Trikampioplotas(){
        Plotas = ((a*b)/2);
    }
    public void Isvedimas(){
        System.out.println("Trikampio plotas");
        System.out.println(Plotas);
    }
}
