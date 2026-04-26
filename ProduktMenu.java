public class ProduktMenu {
    private final String kod;
    private final String nazwa;
    private final double cena;
    private final String kategoria;

    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod() {
        return kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return "Produkt: " + nazwa +
                " | Kod: " + kod +
                " | Cena: " + cena + " zł" +
                " | Kategoria: " + kategoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProduktMenu)) {
            return false;
        }

        ProduktMenu innyProdukt = (ProduktMenu) obj;
        return this.kod.equals(innyProdukt.kod);
    }

    @Override
    public int hashCode() {
        return kod != null ? kod.hashCode() : 0;
    }
}