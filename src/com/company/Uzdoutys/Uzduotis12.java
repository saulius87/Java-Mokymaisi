package com.company.Uzdoutys;

public class Uzduotis12 {

    public int Svoris;
    public float Ugis;
    private float Kmi;


    public Uzduotis12(int svoris, float ugis){
        Svoris = svoris;
        Ugis = ugis;
    }


    public float Kmi(){
        return Kmi = Svoris / (Ugis*2);

    }

    public  void Isvedimas(){
        System.out.println("Jusu Kmi indexas");
        System.out.println(Kmi);

    }
}
