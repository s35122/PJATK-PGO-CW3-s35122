public class Main {
    public static void main(String[] args) {

        System.out.println("TWORZENIE PRODUKTÓW");

        ProduktMenu p1 = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu p2 = new ProduktMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProduktMenu p3 = new ProduktMenu("D-01", "Sernik", 16.0, "deser");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Liczba produktów: " + ProduktMenu.getLiczbaProduktow());

    }
}