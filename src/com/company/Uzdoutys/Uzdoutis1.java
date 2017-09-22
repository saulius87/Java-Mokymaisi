package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzdoutis1 {

    public void HelloWorld(){
        Scanner scaneris = new Scanner(System.in);
        System.out.println("Labas");
        System.out.println("Jusu vardas yra");
        String Vardas = scaneris.nextLine();

        for (int i = 0; i < 5; i++){
            System.out.println(Vardas);
        }

    }
}
