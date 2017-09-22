package com.company;

import com.company.Uzdoutys.*;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static final int UZDAVINYS_1 = 1;
    public static final int UZDAVINYS_2 = 2;
    public static final int UZDAVINYS_3 = 3;
    public static final int UZDAVINYS_4 = 4;
    public static final int UZDAVINYS_5 = 5;
    public static final int UZDAVINYS_6 = 6;
    public static final int UZDAVINYS_7 = 7;
    public static final int UZDAVINYS_8 = 8;
    public static final int UZDAVINYS_9 = 9;
    public static final int UZDAVINYS_10 = 10;
    public static final int UZDAVINYS_11 = 11;
    public static final int UZDAVINYS_12 = 12;
    public static final int UZDAVINYS_13 = 13;
    public static final int UZDAVINYS_14 = 14;
    public static final int UZDAVINYS_15 = 15;
    public static final int UZDAVINYS_16 = 16;

    public static void main(String[] args) {
        Scanner scaneris = new Scanner(System.in);

        while (true) {
            System.out.println("Pasirinkite uzduoti 1-16");
            System.out.println("Isejimas is programos 0");

            int uzdaviniopasirinkimas = scaneris.nextInt();

            switch (uzdaviniopasirinkimas) {

                case UZDAVINYS_1:

                    Uzdoutis1 uzdoutis1 = new Uzdoutis1();
                    uzdoutis1.HelloWorld();
                    break;
                case UZDAVINYS_2:
                    Uzdoutis2 uzdoutis2 = new Uzdoutis2();
                    uzdoutis2.SimboliuSkaicius();

                    break;

                case UZDAVINYS_3:
                    Uzdoutis3 uzdoutis3 = new Uzdoutis3();
                    uzdoutis3.SumaSkirtumas();
                    break;

                case UZDAVINYS_4:
                    Uzduotis4 uzduotis4 = new Uzduotis4();
                    uzduotis4.Ivedimas();
                    uzduotis4.Suma();
                    uzduotis4.Skirtumas();
                    break;
                case UZDAVINYS_5:
                    Uzduotis5 uzduotis5 = new Uzduotis5();

                    uzduotis5.Suma(5, 5);
                    uzduotis5.Suma((float) 6.2, (float) 6.3);
                    break;
                case UZDAVINYS_6:
                    Uzduotis6 uzduotis6 = new Uzduotis6();
                    uzduotis6.Ivedimas();
                    uzduotis6.Kmi();
                    break;

                case UZDAVINYS_7:
                    Uzduotis7 uzduotis7 = new Uzduotis7();
                    uzduotis7.Ivedimas();
                    uzduotis7.Kmi();
                    uzduotis7.Isvedimas();
                    break;

                case UZDAVINYS_8:
                    Uzduotis8 uzduotis8 = new Uzduotis8();
                    uzduotis8.Sanaudos();
                    break;
                case UZDAVINYS_9:
                    Uzduotis9 uzduotis9 = new Uzduotis9();
                    uzduotis9.Ivedimas();
                    uzduotis9.Vidutinis();
                    break;

                case UZDAVINYS_10:
                    Uzduotis10 uzduotis10 = new Uzduotis10();
                    uzduotis10.Ivedimas();
                    uzduotis10.Veiksmai();
                    break;

                case UZDAVINYS_11:

                    Uzduotis11 uzduotis11 = new Uzduotis11();
                    uzduotis11.Veiksmai(12, 13);

                    break;

                case UZDAVINYS_12:
                    Uzduotis12 uzduotis12 = new Uzduotis12(20, (float) 1.96);

                    break;

                case UZDAVINYS_13:
                    Uzduotis13 uzduotis13 = new Uzduotis13();
                    uzduotis13.Ivedimas();
                    uzduotis13.Kvadratas();


                    break;
                case UZDAVINYS_14:
                    Uzduotis14 uzduotis14 = new Uzduotis14();
                    uzduotis14.Ivedimas();
                    uzduotis14.PlotasStaciakampio();

                    break;

                case UZDAVINYS_15:
                    Uzduotis15 uzduotis15 = new Uzduotis15();
                    uzduotis15.Ivedimas();
                    uzduotis15.Trikampioplotas();
                    uzduotis15.Isvedimas();

                    break;

                case UZDAVINYS_16:
                    Uzduotis16 uzduotis16 = new Uzduotis16();
                    uzduotis16.Ivedimas();
                    uzduotis16.Apskritimplotas();
                    uzduotis16.Isvedimas();

                    break;
                default:
                    return;
            }
        }

    }
}
