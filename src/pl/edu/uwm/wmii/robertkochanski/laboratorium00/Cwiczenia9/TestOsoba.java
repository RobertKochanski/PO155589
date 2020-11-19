package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia9;

import pl.imiajd.Kochanski.Cwiczenia9.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {

        ArrayList<Osoba> grupa = new ArrayList<>();

        grupa.add(new Osoba("Kochański", LocalDate.of(1999, 7, 26)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000, 8, 13)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000, 8, 13)));
        grupa.add(new Osoba("Godek", LocalDate.of(1999, 7, 26)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(1998, 2, 4)));

        for (Osoba value : grupa) {
            System.out.println(value);
        }

        System.out.print("\n");

        grupa.sort(Osoba::compareTo);
        for (Osoba osoba : grupa) {
            System.out.println(osoba);
        }
    }
}







