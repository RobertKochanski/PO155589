package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class PracownikDemo1 {

    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();
        LocalDate d = personel[0].dataZatrudnienia();
        d = d.minusYears(10);
        personel[0].setDataZatrudnienia(d);
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();
    }

    static class Pracownik {

        public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
            this.nazwisko = nazwisko;
            this.pobory = pobory;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            dataZatrudnienia = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        public String nazwisko() {
            return nazwisko;
        }

        public double pobory() {
            return pobory;
        }

        public LocalDate dataZatrudnienia() {
            return dataZatrudnienia;
        }

        public void setDataZatrudnienia(LocalDate localDate) {
            dataZatrudnienia = localDate;
        }

        public void zwiekszPobory(double procent) {
            double podwyzka = pobory * procent / 100;
            pobory += podwyzka;
        }

        private String nazwisko;
        private double pobory;
        private LocalDate dataZatrudnienia;
    }
}