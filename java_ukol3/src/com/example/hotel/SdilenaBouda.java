package com.example.hotel;

import java.util.HashSet;
import java.util.Set;

public class SdilenaBouda implements Bouda{
    private int vyska;
    private int sirka;
    private int hloubka;
    private int kapacita;
    private HashSet<Pes> ubytovani = new HashSet<>();

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

    @Override
    public int getKapacita() {
        return kapacita;
    }

    @Override
    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public boolean isObsazeno() {
        int kapacita = this.kapacita;
        int obsazenost = this.ubytovani.size();

        if(obsazenost >= kapacita){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean pridejPsa(Pes pes) {

        // Kontrola, zdali se pes do boudy ještě vejde
        // Je kapacita boudy dostatečná k ubytování dalšího psa?
        boolean jeBoudaObsazena = isObsazeno();

        if (jeBoudaObsazena) {
            // Bouda je již obsazena, přidání psa se nezdařilo
            return false;
        }

        // Není pes "pes" již v této boudě přítomen?
        // TODO doplnit následující výraz tak aby vracel true v případě, kdy pes "pes" je v této boudě již přítomen
        boolean jePesJizVBoude = this.ubytovani.contains(pes);

        if (jePesJizVBoude) {
            // Pes "pes" už v této boudě je, nemůže v ní být dvakrát
            return false;
        }

        // TODO zde obdobně jako výše v této metodě zkontrolovat,
        //  zdali se pes "pes" svou délkou do boudy alespoň v jednom horizontálním
        //  rozměru (šířka či hloubka boudy) vejde.
        //  Pokud ne, nemůže být v této boudě ubytován a metoda navrátí false.
        //  Dále by bylo vhodné zkontrolovat, zdali se do boudy vejde i se psi,
        //  kteří v ní již ubytováni jsou.

        if (pes.getDelka() > sirka && pes.getDelka() > hloubka) {
            return false;
        }

        // Podmínka: celková délka všech psů nesmí přesáhnout horizontální kapacitu
        int celkovaDelka = pes.getDelka();
        for (Pes p : ubytovani) {
            celkovaDelka += p.getDelka();
        }

        // Např. kontrolujme, zda se všichni psi vejdou na plochu (sirka * hloubka)
        if (celkovaDelka > (sirka * hloubka)) {
            return false;
        }

        // Všechny podmínky jsou splněny, přidávám psa do boudy
        ubytovani.add(pes);

        // Abych měl referenci na tuto boudu i v opačném směru, tedy od psa, přidám ji i k psovi
        pes.setBouda(this);

        // Zadařilo se, navracím true
        return true;
    }


    @Override
    public boolean odeberPsa(Pes pes) {
        if(!this.ubytovani.contains(pes)){
            return false;
        }else{
            return this.ubytovani.remove(pes);
        }
    }

    @Override
    public boolean ubytovanaPsa(Pes pes) {
        return this.ubytovani.contains(pes);
    }

    @Override
    public HashSet<Pes> getUbytovaniPsy() {
         return this.ubytovani;
    }

    @Override
    public int getObjem() {
        return vyska * sirka * hloubka;
    }
}
