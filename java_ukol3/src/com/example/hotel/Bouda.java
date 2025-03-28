package com.example.hotel;

import java.util.HashSet;

public interface Bouda {
    int getKapacita();
    void setKapacita(int kapacita);

    boolean isObsazeno();
    //    boolean znamena, jestli to povedlo nebo ne
    boolean pridejPsa(Pes pes);
    //    boolean znamena, jestli to povedlo nebo ne
    boolean odeberPsa(Pes pes);
    boolean ubytovanaPsa(Pes pes);
    HashSet<Pes> getUbytovaniPsy();
    int getObjem();
}
