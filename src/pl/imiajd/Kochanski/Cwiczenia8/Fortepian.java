package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek() {
        System.out.println("pum pum ");
    }
}
