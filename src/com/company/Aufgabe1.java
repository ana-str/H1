package com.company;

public class Aufgabe1 {

        public void Noten(int [] Grades){

            // afisarea notelor
            for (  int i=0;  i< Grades.length; i++)

                System.out.println (Grades[i]);
        }

        public float Durchschnittswert( int [] Grades){

            int summe=0;
            for (int i=0; i< Grades.length; i++)
                summe = summe + Grades[i];

            int NotenAnzahl = Grades.length;
            float durchschnittswert;
            durchschnittswert = summe / NotenAnzahl;

            return durchschnittswert;

        }

        public int[] abgerundeteNoten(int [] Grades)
        {

            int[] neueNoten = new int[Grades.length];
            for (int i=0; i< Grades.length; i++)
                if (Grades[ i ] < 38)
                    neueNoten[i] = Grades[i];

                else if (Grades[i] % 10 == 3 || Grades[i] % 10 == 4)
                    neueNoten[i] = (Grades[i] / 10)*10 + 5;

                else if (Grades[i] %10 == 8 || Grades[i] % 10 == 9  )
                    neueNoten[i] = (Grades [i] / 10 + 1) *10;
                    // 78 --> 80  78/10 =  7 +1  *10
                else
                    neueNoten[i] = Grades[i];

            return neueNoten;

        }

        public int maximalAbgerundeteNote (int [] Grades)
        {
            int[] neueNoten = abgerundeteNoten(Grades);

            int maxim = Grades[0];
            for ( int i = 1; i< Grades.length; i++ )
                if( Grades[i] > maxim)
                    maxim = Grades[i];

            return maxim;
        }



}


