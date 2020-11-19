package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;

public class Skrzypce extends Instrument{

    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek() {
        System.out.println("skrzyp skrzyp");
    }
}
