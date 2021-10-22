package com.company;


public class Aufgabe3 {
    /*  Vorbedingung: eine Ziffer und zwei Arrays, die zwei Zahlen beschreiben */

    int[] arrayA;
    int[] arrayB;
    int ziffer;


    public Aufgabe3(int [] arrA, int[] arrB) {
        arrayA = arrA;
        arrayB = arrB;
    }

    public Aufgabe3 (int [] arrA, int ziff)
    {
        arrayA= arrA;
        ziffer = ziff;
    }

    //a.

    public int[] resultsumme()      ////die "resultSumme"-Methode gibt die Summe der zwei Zahlen zuruck
    {
        int[] result = new int[arrayA.length + 1];      //einen größeren Array für das Ergebnis
        int i;
        int summe;
        int transport = 0;


        for (i = arrayA.length - 1; i >= 0; i--) {
            summe = transport + arrayA[i] + arrayB[i];

            if (summe > 9)
                transport = summe / 10;

            result[i + 1] = summe % 10;
        }

        if (result[0] == 0)     //daca prima pozitie ramane neocupata le mutam pe toate spre stanga cu o poz
        {
            for (i = 0; i < result.length - 1; i++)
                result[i] = result[i + 1];


            int[] newArray = new int[result.length - 1];
            for (i = 0; i < result.length - 1; i++)
                newArray[i] = result[i];

            result = newArray;
        }

        return result;

    }

    //b.
    public int[] resultdifferenz ()
    {

        int[] result = new int[arrayA.length];
        //int differenz;
        int transport = 0;

        for ( int i = arrayA.length-1; i >= 0; i--)
        {

            if (arrayA[i] < arrayB[i]) {
                result[i] = 10 + arrayA[i] - arrayB[i];
                transport = 1;
            }

            else
            {result[i] = arrayA[i] - arrayB[i] - transport;
                transport=0;}

        }

       // if (result[0] == 0)  //scurtare dimensiune vector nou format

        return result;
    }

//c.
    public int[] resultmultiplikation()
    {
        int [] result = new int[arrayA.length];
        int i;
        int transport=0;
        for ( i = arrayA.length-1; i>= 0; i-- )
        {
             int multiplikation = arrayA[i] * ziffer + transport;
             if (multiplikation > 9)
             {
                 result[i] = multiplikation % 10;
                 transport = multiplikation / 10;
             }

             else
             {
                 result[i] = arrayA[i] * ziffer + transport;
                 transport=0;
             }

        }
        return result;
    }


    //d.
    public int[] resultdivision() {

        int nr = 0;
        int aux = 0;
        int k = 0;
        int i;

        for (i = 0; i < arrayA.length; i++)
            nr = nr * 10 + arrayA[i];           //die Zahl wird gebildet

        nr = nr / ziffer;
        aux = nr;

        while (aux != 0) {
            k++;                                //mit k finden wir die Größe des Ergebnisses
            aux = aux / 10;
        }
        int[] result = new int[k];

        for (i = k - 1; i >= 0; i--)
        {
            result[i] = nr % 10;
            nr = nr / 10;
        }

        return result;
    }
}











