package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;

public abstract class Osoba {
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String[] getImiona(){
        return imiona;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

    public boolean getPlec(){
        return plec;
    }

    public abstract String getOpis();

    public String getNazwisko(){
        return nazwisko;
    }

    private String nazwisko;
}
