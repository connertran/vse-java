package com.example.hotel;

import java.util.HashSet;
import java.util.Set;

public class LuxusniBouda {
    private int vyska;
    private int sirka;
    private int hloubka;
    private int kapacita;
    Set<Pes> ubytovani = new HashSet<>();

    public LuxusniBouda() {
        this.vyska = 2;
        this.sirka = 2;
        this.hloubka = 2;
        this.kapacita = 1;
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
