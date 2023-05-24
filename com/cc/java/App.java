package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        // Definierung der Konten
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        // Output Startwert
        output("Anfangs-Kontostand:");
        output("Konto 1: " + konto1.getKontostand());
        output("Konto 2: " + konto2.getKontostand());
        output("Konto 3: " + konto3.getKontostand());

        output("------------------");

        // Multiplikation
        konto1.aktualisiereKontostand(2);
        konto2.aktualisiereKontostand(3);
        konto3.aktualisiereKontostand(10);

        // Ausgabe veränderter Kontostand
        output("Aktueller Kontostand:");
        output("Konto 1: " + konto1.getKontostand());
        output("Konto 2: " + konto2.getKontostand());
        output("Konto 3: " + konto3.getKontostand());

        // Weitere Berechenbarkeit

        output("------------------");

        konto1.aktualisiereKontostand(4);
        konto2.aktualisiereKontostand(2);
        konto3.aktualisiereKontostand(5);
        
        output("Aktueller Kontostand:");
        output("Konto 1: " + konto1.getKontostand());
        output("Konto 2: " + konto2.getKontostand());
        output("Konto 3: " + konto3.getKontostand());

    }

    // Ausgabefunktion
    private static void output(String outStr) {
        System.out.println(outStr);
    }

}