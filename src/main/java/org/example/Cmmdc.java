package org.example;

/// Specificatii
/*
Se dau doua numere intregi. Daca acestea sunt intre 1 si 10 sa se afuiseze cmmdc-ul lor.
Altfel sa se arunce o eroare cu mesajul "Datele de intrare sunt invalide".
*/

public class Cmmdc {
    private static final String DATE_DE_INTRARE_INVALIDE = "Datele de intrare sunt invalide";

    private Cmmdc() {}

    public static int calculeazaCmmdc(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException(DATE_DE_INTRARE_INVALIDE);
        }
        if (a > 10 || b > 10) {
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