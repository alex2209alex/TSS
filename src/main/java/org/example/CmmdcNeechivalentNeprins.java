package org.example;

public class CmmdcNeechivalentNeprins {
    private static final String DATE_DE_INTRARE_INVALIDE = "Datele de intrare sunt invalide";

    private CmmdcNeechivalentNeprins() {}

    public static int calculeazaCmmdc(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException(DATE_DE_INTRARE_INVALIDE);
        }
        if (a > 10 || b >= 10) { // Nu e prins de MC/DC
            throw new IllegalArgumentException(DATE_DE_INTRARE_INVALIDE);
        }
        if (a < b) {
            int aux = a;
            a = b;
            b = aux;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
