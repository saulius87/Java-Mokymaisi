package com.company.Uzdoutys;

import java.util.Scanner;

public class Uzdoutis2 {

public void SimboliuSkaicius(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Yveskite zody");
    String zodis = scanner.nextLine();

    System.out.println("Zody sudaro simboliu");
    System.out.println(zodis.length());
}

}
