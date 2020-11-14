package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

public class Zadanie1 {
    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.odliczMiesieczneOdsetki();
        saver2.odliczMiesieczneOdsetki();
        System.out.println(saver1.saldo());
        System.out.println(saver2.saldo());

        System.out.print("\n");

        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.odliczMiesieczneOdsetki();
        saver2.odliczMiesieczneOdsetki();
        System.out.println(saver1.saldo());
        System.out.println(saver2.saldo());
    }
}
