package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis14 {
    Scanner scanner = new Scanner(System.in);

    int a;
    int b;

    public void Ivedimas(){
        System.out.println("Yveskite pirma skaiciu");
        a= scanner.nextInt();
        System.out.println("Yveskite antra skaiciu");
        b = scanner.nextInt();
    }


    public void PlotasStaciakampio(){
        System.out.println("Stacikampio plotas");
        System.out.println(a*b);
    }
}
