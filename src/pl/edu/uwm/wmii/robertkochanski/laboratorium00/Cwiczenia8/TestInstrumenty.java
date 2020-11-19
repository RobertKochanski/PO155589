package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia8;

import pl.imiajd.Kochanski.Cwiczenia8.Flet;
import pl.imiajd.Kochanski.Cwiczenia8.Fortepian;
import pl.imiajd.Kochanski.Cwiczenia8.Instrument;
import pl.imiajd.Kochanski.Cwiczenia8.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Flet("FletA", LocalDate.of(1994, 2, 1)));
        orkiestra.add(new Flet("FletB", LocalDate.of(2017, 9, 3)));
        orkiestra.add(new Fortepian("FortepianA", LocalDate.of(1835, 6, 18)));
        orkiestra.add(new Fortepian("FortepianB", LocalDate.of(1996, 3, 5)));
        orkiestra.add(new Skrzypce("SkrzypceA", LocalDate.of(2000, 12, 12)));



        for (Instrument instrument : orkiestra) {
            instrument.dzwiek();
        }
        for (Instrument instrument : orkiestra) {
            System.out.println(instrument.toString());
        }
    }
}
