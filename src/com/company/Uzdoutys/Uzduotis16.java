package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis16 {
    Scanner scanner = new Scanner(System.in);

    int a;
    private static double PI = 3.1415;
    double Plotas;

    public void Ivedimas(){
        System.out.println("Yveskite pirma skaiciu");
         a = scanner.nextInt();

    }


    public void  Apskritimplotas(){
        Plotas =  (PI*(a*2));
    }
    public void Isvedimas(){
        System.out.println("Apskritimo plotas");
        System.out.println(Plotas);
    }
}
