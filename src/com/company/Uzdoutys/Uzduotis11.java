package com.company.Uzdoutys;

public class Uzduotis11 {

    public void Veiksmai(int pirmas, int antras) {
        Suma(pirmas, antras);
        Skirtumas(pirmas, antras);
        Sandauga(pirmas, antras);
    }

    public void Veiksmai(float pirmas, int antras) {
        Suma(pirmas, antras);
        Skirtumas(pirmas, antras);
        Sandauga(pirmas, antras);
    }

    public static void Suma(int pirmas, int antras) {
        System.out.println(pirmas + antras);
    }

    public static void Suma(float pirmas, float antras) {
        System.out.println((pirmas + antras));

    }

    public static void Skirtumas(int pirmas, int antras) {
        System.out.println(pirmas - antras);

    }

    public static void Skirtumas(float pirmas, int antras) {
        System.out.println(pirmas - antras);
    }

    public static void Sandauga(int pirmas, int antras) {
        System.out.println(pirmas * antras);
    }

    public static void Sandauga(float pirmas, float antras) {
        System.out.println(pirmas * antras);
    }


}
