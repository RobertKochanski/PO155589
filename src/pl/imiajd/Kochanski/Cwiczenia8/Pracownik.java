package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;
import java.util.Arrays;

public class Pracownik extends Osoba {

    private LocalDate dataZatrudnienia;

    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory,
                     LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }

    public double getPobory() {
        return pobory;
    }

    public String getOpis() {
        return Arrays.toString(getImiona()) + " " + getNazwisko() + ", urodzony/a: " + getDataUrodzenia() + ", płeć: " +
                (getPlec() ? "mężczyzna, " : "kobieta, ") + "pracownik zatrudniony w dniu " + dataZatrudnienia +
                " z pensja " + pobory + "zł";
    }

    private double pobory;
}
