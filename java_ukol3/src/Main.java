import com.example.hotel.*;

public class Main {
    public static void main (String[] args) {

        // Vytvořím psí hotel
        PsiHotel hotel = new PsiHotel();

        // Nastavím maximální objem pro boudy na 18m3
        hotel.setMaximalniObjemProBoudy(18);


        // Ubytovaní psy v hotelu:
        hotel.vypisBoudySePsi(); // Prázdné

        // Ubytování psa
        Pes karel = new Pes("Karel", 1);
        hotel.ubytujPsa(karel);

        Pes jiri = new Pes("Jiří", 2);
        hotel.ubytujPsa(jiri);

        //  Jiří i Karel by nyní měli mít vlastní boudu:
        for (Pes pes: new Pes[]{karel, jiri}) {
            System.out.println("Je " + pes.getJmeno() + " ubytovaný v boudě? " + pes.isUbytovany());
        }

        // Pokusím se ubytovat příliš velkého psa do příliš malé boudy:
        Bouda bouda = new StandardniBouda();
        Pes jaromir = new Pes("Jaromír", 3);
        hotel.ubytujPsa(jaromir, bouda);    // Po doplnění kontrol (viz TO-DO) vrátí false
        // a Jaromíra neubytuje, protože je moc velký

        // Je hotel obsazený boudami? Tzn. je prostor pro boudy vyčerpán?
        System.out.println("Je hotel obsazený boudami? " + hotel.isObsazeno()); // false

        // Přidám do zásoby pár psích boud:
        hotel.pridejBoudu(new StandardniBouda());   // true
        hotel.pridejBoudu(new StandardniBouda());   // true
        hotel.pridejBoudu(new StandardniBouda());   // true
        hotel.pridejBoudu(new StandardniBouda());   // true
        hotel.pridejBoudu(new StandardniBouda());   // true

        // bouda1 a bouda2 nebudou zůstávat v hotelu dlouho, pak odebereme tyhle boudy a přídáme Sdilenouboudu/luxusniboudu.
        Bouda bouda1 = new StandardniBouda();
        Bouda bouda2 = new StandardniBouda();
        hotel.pridejBoudu(bouda1);   // true
        hotel.pridejBoudu(bouda2);   // vrátí true / false v závislosti na ubytování psa Jaromíra
        hotel.pridejBoudu(new StandardniBouda());   // false - tato bouda už se do hotelu nevejde
        // (nutné implementovat podmínku v TO-DO)
        hotel.pridejBoudu(new StandardniBouda());   // false - tato bouda už se do hotelu nevejde
        // (nutné implementovat podmínku v TO-DO)
        hotel.pridejBoudu(new StandardniBouda());   // false - tato bouda už se do hotelu nevejde
        // (nutné implementovat podmínku v TO-DO)
        System.out.println("Ubytovat psy ....");
        // Obsadím volné boudy pár psi:
        System.out.println(hotel.ubytujPsa(new Pes("Erben", 1))); // vrátí true
        System.out.println(hotel.ubytujPsa(new Pes("Hyne", 1))); // vrátí true
        System.out.println(hotel.ubytujPsa(new Pes("Mácha", 2))); // vrátí true
        System.out.println(hotel.ubytujPsa(new Pes("Vodník", 2))); // vrátí true

        // TODO Naplňte hotel dále různými boudami (vyměnte standardní boudu za
        //  sdílenou / luxusní) a psi tak, aby se do něj už žádný další pes
        //  ubytovat nemohl, tzn. aby metoda hotel.ubytujPsa() vrátila hodnotu false.
        Bouda sdilena = new SdilenaBouda(); // 4m³
        // Vyměníme momentální prázdné standární boudy za sdilenou boudu
        System.out.println(hotel.odeberBoudu(bouda1));
        System.out.println(hotel.odeberBoudu(bouda2));

        // momentálně v hotelu máme jen 1 prazdná standarni bouda
        hotel.ubytujPsa(new Pes("David", 2));


        // momentálně do hotelu se vejde jen jedna Sdilena bouda; Bob a Bobek budou ve stejné boudě
        hotel.pridejBoudu(sdilena);
        hotel.ubytujPsa(new Pes("Bob", 2), sdilena);
        hotel.ubytujPsa(new Pes("Bobek", 2), sdilena);

        System.out.println("Hotel je plný: "+hotel.isObsazeno()); // true

        //už nemůžeme přidat žádného dalšího psa.
        System.out.println("Kaja je v hotelu: " + hotel.ubytujPsa((new Pes("Kaja", 1)))); //false, protože hotel je plny

        // výpis všech psů
        hotel.vypisBoudySePsi();

        //testovat, jestli metoda find v class PsiHotel funguje
        System.out.println("Bouda, která má kapacitu 4, je "+hotel.find("kapacita:4")); //hledat boudy podle kapacity
        System.out.println("Bouda, ve které je David, je "+hotel.find("David")); //hledat boudy podle psů v boudách
    }
}
