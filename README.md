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

```java
ProduktMenu(String kod, String nazwa, double cena, String kategoria)