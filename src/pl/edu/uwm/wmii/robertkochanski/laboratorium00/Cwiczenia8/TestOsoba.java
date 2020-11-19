package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia8;

import pl.imiajd.Kochanski.Cwiczenia8.Osoba;
import pl.imiajd.Kochanski.Cwiczenia8.Pracownik;
import pl.imiajd.Kochanski.Cwiczenia8.Student;

import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan", "Bogdan"}, LocalDate.of(1973, 6, 22),
                true, 10000, LocalDate.of(2012, 2, 19));
        ludzie[1] = new Student("Nowak",new String[]{"Małgorzata"}, LocalDate.of(1999, 10, 15),
                false, "informatyka");
        //ludzie[2] = new Osoba("Dyl Sowizdrzał");

        ((Student)ludzie[1]).setSredniaOcen(3.6);
        
        for (Osoba p : ludzie) {
            if(p instanceof Student){
                System.out.println(p.getOpis());
            }
            if(p instanceof Pracownik){
                System.out.println(p.getOpis());
            }
        }
    }
}







