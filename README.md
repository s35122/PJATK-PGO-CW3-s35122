# README – Klasa ProduktMenu

## Opis
Klasa `ProduktMenu` reprezentuje pojedynczy produkt dostępny w menu kawiarni. 
Zawiera podstawowe informacje o produkcie, takie jak kod, nazwa, cena oraz kategoria.

---

## Pola
- `kod` – unikalny identyfikator produktu,
- `nazwa` – nazwa produktu,
- `cena` – cena produktu,
- `kategoria` – kategoria (np. kawa, deser),
- `liczbaProduktow` (static) – licznik wszystkich utworzonych produktów.

---

## Konstruktor
Tworzy nowy obiekt produktu i automatycznie zwiększa licznik produktów.


# README – Klasa KlientKawiarni

## Opis
Klasa `KlientKawiarni` reprezentuje klienta składającego zamówienie w systemie kawiarni.  
Przechowuje podstawowe dane identyfikacyjne oraz kontaktowe.

---

## Pola
- `idKlienta` – unikalny identyfikator klienta,
- `imie` – imię klienta,
- `nazwisko` – nazwisko klienta,
- `email` – adres email klienta.

---

## Konstruktor
Tworzy nowy obiekt klienta.

KlientKawiarni(int idKlienta, String imie, String nazwisko, String email)