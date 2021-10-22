package com.company;

public class ElektronikShop {
    int [] USBs ;
    int [] tastaturen ;

    public ElektronikShop(int[] t, int[] usbs) {
        tastaturen = t;
        USBs = usbs;
    }


    public int billigsteTastatur()
    {
        int minim = 9999;
        int i;
        for (  i = 0; i < tastaturen.length; i++)
            if (tastaturen[i] < minim )
                minim = tastaturen[i];

        return minim;

    }

    public int teuerstenGegenstand()
    {
        int i;
        int j;
        int teuersten = 0;
        for ( i = 0; i < tastaturen.length; i++ )
            if (tastaturen [i]  > teuersten)
                teuersten = tastaturen [i];

        for (j = 0; j < tastaturen.length; j++)
            if (USBs [j] > teuersten)
                teuersten = USBs[j];

        return teuersten;
    }


    public int teuersteUSB( int budget)
    {
        int teuerste = 1;
        int i;
        for( i = 0; i < USBs.length; i++)
            if (USBs[i] > teuerste && USBs[i] <= budget )
                teuerste = USBs [i];


        return teuerste;
    }


    public int maximalenGeldbetrag(int budget, int[] tastaturenPreis, int[] USBsPreis) {
        int maxgeldbetrag = 1;
        int i, j;

        for (i = 1; i < tastaturenPreis.length; i++) {
            for (j = 1; j < USBsPreis.length; j++)
                if ((tastaturenPreis[i] + USBsPreis[j] <= budget) && (tastaturenPreis[i] + USBsPreis[j] > maxgeldbetrag))
                    maxgeldbetrag = tastaturenPreis[i] + USBsPreis[j];
        }
        if (maxgeldbetrag == 1)
            return -1;
        else
            return maxgeldbetrag;
    }


}
