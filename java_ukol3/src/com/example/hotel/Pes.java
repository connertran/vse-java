package com.example.hotel;

public class Pes implements Searchable {
    /** Výchozí barva psa, pokud není uvedena */
    private static final String VYCHOZI_BARVA_PSA = "- barva je tajná -";
    private String jmeno;
    private String barva;
    private int delka;
    Bouda bouda;


    public Pes(String jmeno, int delka) {
        this(jmeno, "Ehm, jsem neurčité barvy", delka );
    }



    public Pes (String jmeno, String barva, int delka) {
        this.jmeno = jmeno;
        this.barva = barva;
        this.delka = delka;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public int getDelka() {
        return delka;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public Bouda getBouda(){
        return bouda;
    }

    public void setBouda(Bouda bouda){
        this.bouda = bouda;
    }

    public boolean isUbytovany(){
        return bouda != null;
    }

    public int getObjemBoudy(){
        if(isUbytovany()){
            return bouda.getObjem();
        }
        return 0;
    }

    public String zastekej(){
        System.out.println(this);
        return this.toString();
    }
    @Override
    public String toString() {
        return "Ja jsem pes " + jmeno + ". Haf haf!";
    }

    @Override
    public String getDisplayName() {
        return this.jmeno;
    }

    @Override
    public String prepareSearchableString() {
        return jmeno + " " + barva + " " + delka;
    }
}
