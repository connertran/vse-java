package com.example.hotel;

import java.util.Set;

public interface Bouda {
    public int getKapacita();
    public void setKapacita(int kapacita);

    public boolean isObsazeno();
    //    boolean znamena, jestli to povedlo nebo ne
    public boolean pridejPsa(Pes pes);
    //    boolean znamena, jestli to povedlo nebo ne
    public boolean odeberPsa(Pes pes);
    public boolean ubytovanaPsa(Pes pes);
    public Set<Pes> getUbytovaniPsy();
    public int getObjem();
}
