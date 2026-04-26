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

        System.out.println("TEST KLIENTA");

        KlientKawiarni k1 = new KlientKawiarni(1, "Jan", "Kowalski", "jan@mail.pl");
        KlientKawiarni k2 = new KlientKawiarni(1, "Jan", "Kopia", "inny@mail.pl");
        KlientKawiarni k3 = new KlientKawiarni(2, "Anna", "Nowak", "anna@mail.pl");

        System.out.println(k1);
        System.out.println("Pełne dane: " + k1.getPelneDane());

        System.out.println("Porównania:");
        System.out.println("k1 == k2: " + k1.equals(k2)); // true (ten sam ID)
        System.out.println("k1 == k3: " + k1.equals(k3)); // false


        System.out.println("TEST ZAMÓWIENIA");

        KlientKawiarni klient = new KlientKawiarni(1, "Jan", "Kowalski", "jan@mail.pl");

        Zamowienie z1 = new Zamowienie(klient);

        z1.dodajProdukt(p1);
        z1.dodajProdukt(p2);

        System.out.println(z1);

        System.out.println("\nWartość: " + z1.policzWartosc());
        System.out.println("Liczba produktów: " + z1.policzLiczbeProduktow());

        z1.oznaczJakoOplacone();

        System.out.println("\nPo opłaceniu:");
        System.out.println(z1);

    }
}