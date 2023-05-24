package com.cc.java;

public class Konto {

    private int kontostand;

    // Konstruktor
    public Konto() {
        this.kontostand = 10000;
    }


    // Methode für den Multiplikator
    public void aktualisiereKontostand(int faktor) {
        kontostand *= faktor;
    }

    // Getter für kontostand
    public int getKontostand() {
        return this.kontostand;
    }
}

