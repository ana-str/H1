package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] Grades = new int [] { 30, 57, 89, 38, 75, 99, 42};

        Aufgabe1 student = new Aufgabe1();

        student.Noten(Grades);
        System.out.println(student.Durchschnittswert(Grades));
        System.out.println(student.abgerundeteNoten(Grades));

        System.out.println(student.maximalAbgerundeteNote(Grades));

        student.Noten (student.abgerundeteNoten(Grades));

        Aufgabe2 Anzahl = new Aufgabe2();
        System.out.println("Die maximale Zahl ist " + Anzahl.maximal(Grades));
        System.out.println("Die minimale Zahl ist " + Anzahl.minimal(Grades));
        System.out.println("Die maximale Summe ist " + Anzahl.maximaleSumme(Grades));
        System.out.println("Die minimale Summe ist " + Anzahl.minimaleSumme(Grades));

        int [] arrayA = new int [] {1, 3, 0,0,0,0,0,0,0};
        int [] arrayB = new int [] {8, 7, 9,0,0,0,0,0,0};
        int ziffer = 9;

       // int [] result = new int []{};


        Aufgabe3 ErgebnissSum = new Aufgabe3(arrayA, arrayB);

        //System.out.println("Die summe ist " + Ergebniss.resultsumme());

        System.out.println("Die Ergebniss  der Summe ist  " + Arrays.toString(ErgebnissSum.resultsumme()));

        Aufgabe3 ErgebnissDiff = new Aufgabe3(arrayA, arrayB);
        System.out.println("Die Ergebniss der Differenz ist  " + Arrays.toString(ErgebnissDiff.resultdifferenz() ) );

        Aufgabe3 ErgebnissMul = new Aufgabe3(arrayA, ziffer);
        System.out.println("Die Ergebniss der Multiplikation ist  " + Arrays.toString(ErgebnissMul.resultmultiplikation() ) );

        Aufgabe3 ErgebnissDiv = new Aufgabe3(arrayA, ziffer);
        System.out.println("Die Ergebniss der Division ist  " + Arrays.toString(ErgebnissDiv.resultdivision() ) );



        int [] tastaturen = new int [] {20, 56, 88, 19, 50, 75, 62};
        int [] USBs = new int [] {20, 50, 88, 90, 35, 75, 45};

        ElektronikShop Produkt = new ElektronikShop(tastaturen, USBs);
        System.out.println("Das billigste Tastatur kostet  " + Produkt.billigsteTastatur());

        ElektronikShop teuersteProdukt = new ElektronikShop(tastaturen, USBs);
        System.out.println("Das teuerste Produkt  kostet " + teuersteProdukt.teuerstenGegenstand() );

        int budget = 60;

        ElektronikShop teuersteUSB = new ElektronikShop(tastaturen, USBs);
        System.out.println("Das teuerste USB kostet " + teuersteProdukt.teuersteUSB(budget) );



        //List<Integer> pricesUSB = new ArrayList<Integer>(Arrays.asList(8, 12));
        // List<Integer> pricesKeyboard = new ArrayList<Integer>(Arrays.asList(40,50, 60));
        int [] tastaturenPreis = new int[] {40, 50, 60};
        int [] USBsPreis = new int[] {8, 12, 2};


        ElektronikShop Paket = new ElektronikShop( tastaturenPreis, USBsPreis);
        System.out.println("Der maximalen Geldbetrag  fuer einen Paket ist " + Paket.maximalenGeldbetrag(budget, tastaturenPreis, USBsPreis) );


    }
}
