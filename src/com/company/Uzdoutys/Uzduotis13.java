package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzduotis13 {
    Scanner scanner = new Scanner(System.in);

    int a;

    public void Ivedimas(){
        System.out.println("Yveskite skaiciu");
        a= scanner.nextInt();
    }

    public void Kvadratas(){
        System.out.println("Kvadratas");
        System.out.println(Math.pow(a, 2));
    }
}
