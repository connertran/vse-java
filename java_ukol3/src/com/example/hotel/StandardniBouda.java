package com.example.hotel;

import java.util.HashSet;
import java.util.Set;

public class StandardniBouda {
    private int vyska;
    private int sirka;
    private int hloupka;

    private int kapacita;

    Set<Pes> ubytovani = new HashSet<>();

    public StandardniBouda() {
        this.vyska = 1;
        this.sirka = 1;
        this.hloupka = 2;
        this.kapacita = 1;
    }

    public int getVyska() {
        return vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public int getHloupka() {
        return hloupka;
    }
}
