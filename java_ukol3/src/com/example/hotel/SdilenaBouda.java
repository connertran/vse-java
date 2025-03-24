package com.example.hotel;

import java.util.HashSet;
import java.util.Set;

public class SdilenaBouda {
    private int vyska;
    private int sirka;
    private int hloubka;
    private int kapacita;
    private Set<Pes> ubytovani = new HashSet<>();

    public SdilenaBouda() {
        this.vyska = 1;
        this.sirka = 2;
        this.hloubka = 2;
        this.kapacita = 4;
    }

    public int getVyska() {
        return vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public int getHloubka() {
        return hloubka;
    }
}
