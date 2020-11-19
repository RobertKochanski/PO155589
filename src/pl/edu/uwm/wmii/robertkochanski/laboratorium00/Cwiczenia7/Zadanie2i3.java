package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia7;

import pl.imiajd.Kochanski.Cwiczenia7.Adres;

public class Zadanie2i3 {
    public static void main(String[] args){
    Adres a1 = new Adres("ulica1", 2, 4, "Olsztyn", "11-072");
    Adres a2 = new Adres("ulica2", 3, "Olsztyn", "11-073");

    a1.pokaz();
    System.out.print("\n");
    a2.pokaz();
    System.out.print("\n");
    System.out.println("a1 przed a2: " + a1.przed(a2));
    System.out.println("a2 przed a1: " + a2.przed(a1));
    }
}
