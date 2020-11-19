package pl.imiajd.Kochanski.Cwiczenia8;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {

    public String producent;
    public LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract void dzwiek();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) &&
                Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    public String toString() {
        return "Instrument{" + "producent = " + producent + ", rokProdukcji = " + rokProdukcji + '}';
    }
}
