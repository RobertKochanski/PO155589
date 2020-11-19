package pl.imiajd.Kochanski.Cwiczenia9;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String toString() {
        return  getClass().getSimpleName()+ "[" + "nazwisko='" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + ']';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    public int compareTo(Osoba o) {
        int a = nazwisko.compareTo(o.nazwisko);
        if(a == 0) return dataUrodzenia.compareTo(o.dataUrodzenia);
        return a;
    }
}
