package pl.imiajd.Kochanski.Cwiczenia9;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student s) {
        int a = super.compareTo(s);
        if(a == 0) return (Double.toString(s.sredniaOcen).compareTo(Double.toString(s.sredniaOcen)));
        return a;
    }

    public String toString() {
        return getClass().getSimpleName()+ "[" + "nazwisko='" + getNazwisko() + ", dataUrodzenia=" + getDataUrodzenia()
                + ", sredniaOcen=" + sredniaOcen + ']';
    }
}
