public class Main {
    public static void main(String[] args) {
        //vytvorit boudu
        Bouda bouda = new Bouda();
        bouda.setVyska(10);
        bouda.setSirka(5);
        bouda.setHloubka(3);

        //vytvorit psa
        Pes pes1 = new Pes(bouda, "Rex", 50, "hnědá");

        //vyzkouset objekt
        System.out.println(pes1);
        System.out.println(pes1.getJmeno());
        System.out.println("Objem boudy: " + pes1.getObjemBoudy());
        System.out.println("Pes štěká: " + pes1.zastekej());
    }
}
