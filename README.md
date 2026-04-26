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


# README – Klasa Zamowienie

## Opis
Klasa `Zamowienie` reprezentuje pojedyncze zamówienie w systemie kawiarni.  
Łączy klienta z listą zamówionych produktów oraz umożliwia obliczenie wartości zamówienia.

---

## Pola
- `numerZamowienia` – unikalny numer zamówienia,
- `klient` – obiekt klasy `KlientKawiarni`,
- `produkty` – lista produktów (`ArrayList<ProduktMenu>`),
- `oplacone` – status płatności (true/false),
- `kolejnyNumer` (static) – licznik służący do automatycznego nadawania numerów zamówień.

---

## Konstruktor
Tworzy nowe zamówienie i automatycznie przypisuje numer.

Zamowienie(KlientKawiarni klient)


# README – Testy w klasie Main

## Opis
Klasa `Main` służy do przetestowania działania systemu obsługi zamówień w kawiarni.  
Program tworzy produkty, klientów oraz zamówienie, a następnie wypisuje wyniki w konsoli.

---

## Zakres testów

### 1. Tworzenie produktów
Program tworzy trzy produkty:
- Espresso,
- Cappuccino,
- Sernik.

Sprawdzane jest:
- poprawne utworzenie obiektów `ProduktMenu`,
- działanie metody `toString()`,
- działanie statycznego licznika produktów `getLiczbaProduktow()`.

---

### 2. Test klienta
Program tworzy trzech klientów:
- `k1`,
- `k2`,
- `k3`.

Sprawdzane jest:
- poprawne utworzenie obiektów `KlientKawiarni`,
- działanie metody `getPelneDane()`,
- działanie metody `toString()`,
- porównywanie klientów metodą `equals()`.

Porównania:
- `k1.equals(k2)` zwraca `true`, ponieważ klienci mają ten sam identyfikator,
- `k1.equals(k3)` zwraca `false`, ponieważ klienci mają różne identyfikatory.

---

### 3. Test zamówienia
Program tworzy klienta oraz jedno zamówienie `z1`.

Do zamówienia dodawane są:
- Espresso,
- Cappuccino.

Sprawdzane jest:
- dodawanie produktów do zamówienia,
- działanie `ArrayList`,
- obliczanie wartości zamówienia metodą `policzWartosc()`,
- liczenie produktów metodą `policzLiczbeProduktow()`,
- wypisanie zamówienia przez `toString()`,
- zmiana statusu zamówienia na opłacone.

---


