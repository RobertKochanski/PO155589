package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia6;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldoPoczatkowe){
        saldo = saldoPoczatkowe;
    }

    public double saldo(){
        return saldo;
    }

    public void odliczMiesieczneOdsetki() {
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa){
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
}