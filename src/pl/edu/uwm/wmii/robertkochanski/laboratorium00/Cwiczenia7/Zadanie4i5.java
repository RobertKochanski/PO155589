package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia7;

import pl.imiajd.Kochanski.Cwiczenia7.Nauczyciel;
import pl.imiajd.Kochanski.Cwiczenia7.Osoba;
import pl.imiajd.Kochanski.Cwiczenia7.Student;

public class Zadanie4i5 {

    public static void main(String[] args){
        Osoba a1 = new Osoba("Kowalski", 2002);
        Student a2 = new Student("Nowak", 1999, "Informatyka");
        Nauczyciel a3 = new Nauczyciel("Bogdan", 1983, 2000);

        System.out.println("Osoba: " + a1.toString());
        System.out.println("Student: " + a2.toString());
        System.out.println("Nauczyciel: " + a3.toString());
    }
}
