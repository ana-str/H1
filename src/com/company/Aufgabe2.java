package com.company;

public class Aufgabe2 {

    public int maximal( int [] Grades){
        int maxim = Grades[0];
        for (int i  =1; i<Grades.length; i++)
            if (Grades[i] > maxim)
                maxim = Grades[i];
        return maxim;
    }

    public int minimal( int [] Grades){
        int minim = Grades[0];
        for (int i=1; i<Grades.length; i++)
            if (Grades[i] < minim)
                minim = Grades[i];
        return minim;
    }

    public int maximaleSumme( int [] Grades){

         int summe = 0;
        for (int i=0; i<Grades.length; i++)
            summe = summe + Grades [i];

         int summeMax = summe - minimal(Grades);
         return summeMax;
    }

    public int minimaleSumme( int [] Grades){
        int summe=0;
        for ( int i=0; i<Grades.length; i++)
            summe = summe + Grades [i];

        int summeMin = summe - maximal(Grades);
        return summeMin;

    }

}
