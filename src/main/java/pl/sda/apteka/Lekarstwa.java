package pl.sda.apteka;

import java.util.stream.IntStream;

public class Lekarstwa {
    private String[] nazwa = {"apap", "paracetamol", "ibuprom"};
    private double[] cena = {10, 16, 8};
    private double[] refundacja = {0.1, 0.3, 0.2};

    public Lekarstwa(String[] nazwa, double[] cena, double[] refundacja) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.refundacja = refundacja;
    }

    public Lekarstwa() {

    }

    public double cena(String lek, boolean ubezpieczony) {
        double cenaLeku = 0;
        double poziomRefundacji = 0;
        for (int i = 0; i < nazwa.length; i++) {
            if (lek == nazwa[i]) {
                cenaLeku = cenaLeku + cena[i];
                if (ubezpieczony) {
                    poziomRefundacji = cenaLeku * refundacja[i];
                    cenaLeku = cenaLeku - poziomRefundacji;
                }
            }
        }
        System.out.println ("cena leku p refundacji: " + cenaLeku);
        return cenaLeku;
    }

    public String maksymalnaRefundacja() {

        double tymczasowyWynik = 0;
        double maxWynik = 0;
        String max = null;

        for (int i = 0; i < refundacja.length; i++) {
            tymczasowyWynik = cena[i] * refundacja[i];

            if (tymczasowyWynik > maxWynik) {
                maxWynik = tymczasowyWynik;
                max = nazwa[i];
            }
        }
        System.out.println ("Lek o maksymalnej refundacji:" + " " + max);
        return max;
    }

    public double kosztCalkowity() {
        double suma = 0;
        double cenaLeku = 0;
        for (int i = 0; i < cena.length; i++) {
            cenaLeku = cena[i];
            suma = suma + cenaLeku;
        }
        System.out.println ("Koszt całkowity leków:" + " " + suma);
        return suma;
    }

    public void wyswietl(String Lek) {
        System.out.println ("Lek 1: " + nazwa [0]+ ", " + "Cena: " + cena[0] + ", " + "Refundacja: " + refundacja[0] );
        System.out.println ("Lek 2: " + nazwa [1]+ ", " + "Cena: " + cena[1] + ", " + "Refundacja: " + refundacja[1] );
        System.out.println ("Lek 3: " + nazwa [2]+ ", " + "Cena: " + cena[2] + ", " + "Refundacja: " + refundacja[2]);
    }
}