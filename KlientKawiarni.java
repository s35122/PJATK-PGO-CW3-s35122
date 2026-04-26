public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public String getPelneDane() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    @Override
    public String toString() {
        return "Klient: " + imie + " " + nazwisko +
                " | ID: " + idKlienta +
                " | Email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof KlientKawiarni)) return false;

        KlientKawiarni inny = (KlientKawiarni) obj;
        return this.idKlienta == inny.idKlienta;
    }
}