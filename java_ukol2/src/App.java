import com.example.catalog.Catalog;
import com.example.document.*;

public class App {
    public static void  main(String[] args){
        Catalog catalog = new Catalog();

        Book book = new Book(
                "Dášeňka čili život štěněte",
                "978-80-242-2614-9",
                "Knižní klub",
                "2009",
                80
        );

        WebPage page = new WebPage(
                "https://fis.vse.cz",
                "Fakulta informatiky a statistiky – Vysoká škola ekonomická v Praze",
                "Fakulta sdružuje katedry a studijní programy zabývající se informačními systémy a statistickými, ekonometrickými i dalšími matematickými metodami aplikovanými ve všech oblastech hospodářského života."
        );

        Document document = new Document(
                "198229-2/OAM-2022",
                "Rozhodnutí o udělení stipendia",
                "Dne 27.02.2025 Vám bylo uděleno stipendium."
        );

        Interview interview = new Interview(
                "Karel Čapek",
                "Josef Čapek",
                "KČ: Dobrý den. JČ: Ahoj., ...",
                27
        );

        catalog.setStoredItem1(book);
        catalog.setStoredItem2(page);
        catalog.setStoredItem3(document);
        catalog.setStoredItem4(interview);

        String all = catalog.printAll();

        System.out.println("Vypisuji vše:");
        System.out.print(all);

        System.out.println();

        String query = "život";
        System.out.println("Vyhledávám výraz '" + query + "':");

        String result = catalog.find(query);
        System.out.println(result);

        // Domaci ukol
        System.out.println("Domácí úkol:");
        System.out.println(page.printContents());
        System.out.println(document.printContents());
    }
}
