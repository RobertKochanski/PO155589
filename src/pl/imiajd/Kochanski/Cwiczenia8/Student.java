package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Osoba {

    private double sredniaOcen;

    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return Arrays.toString(getImiona()) + " " + getNazwisko() + ", urodzony/a: " + getDataUrodzenia() + ", płeć: " +
        (getPlec() ? "mężczyzna, " : "kobieta, ") + "kierunek studiów: " + kierunek + ". Średnia ocen: " + sredniaOcen;
    }

    private String kierunek;
}
