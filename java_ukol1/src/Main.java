public class Main {
    public static void main(String[] args) {
        // ✅ Create a Bouda
        Bouda bouda = new Bouda();
        bouda.setVyska(10);
        bouda.setSirka(5);
        bouda.setHloubka(3);

        // ✅ Create a Pes with Bouda
        Pes pes1 = new Pes(bouda, "Rex", 50, "hnědá");
        System.out.println(pes1);
        System.out.println("Objem boudy: " + pes1.getObjemBoudy());

        // ✅ Make the dog bark
        System.out.println("Pes štěká: " + pes1.zastekej());
    }
}
