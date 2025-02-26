public class Pes {
    private String jmeno;
    private String barva;
    private int delka;
    private boolean zableseny;
    private Bouda bouda;

    public Pes(Bouda bouda, String jmeno, int delka) {
        this.bouda = bouda;
        this.jmeno = jmeno;
        this.delka = delka;
    }

    public Pes(Bouda bouda, String jmeno, int delka, String barva) {
        this.jmeno = jmeno;
        this.delka = delka;
        this.barva = barva;
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

    public boolean isZableseny(){
        return zableseny;
    }

    public void setZableseny(boolean zableseny) {
        this.zableseny = zableseny;
    }

    public int getObjemBoudy(){
        return bouda.getObjem();
    }

    public String zastekej(){
        return "Go Go Go Go Go Go";
    }

    @Override
    public String toString() {
        return "Pes{" +
                "jmeno='" + jmeno + '\'' +
                ", barva='" + barva + '\'' +
                ", delka=" + delka +
                ", zableseny=" + zableseny +
                '}';
    }
}