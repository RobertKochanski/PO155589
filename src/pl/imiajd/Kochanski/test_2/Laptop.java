package pl.imiajd.Kochanski.test_2;

import java.time.LocalDate;

public class Laptop extends Komputer{

    boolean czyApple;

    public Laptop(String nazwa, LocalDate dataProdukcji, boolean czyApple) {
        super(nazwa, dataProdukcji);
        this.czyApple = czyApple;
    }

    public boolean isCzyApple() {
        return czyApple;
    }

    @Override
    public int compareTo(Komputer o){
        if(getNazwa().equalsIgnoreCase(o.getNazwa())){
            return getDataProdukcji().compareTo(o.getDataProdukcji());
        }
        return getNazwa().compareTo(o.getNazwa());
    }

    @Override
    public String toString() {
        return "nazwa= " + getNazwa() + ", dataProdukcji= " + getDataProdukcji() + ", czyApple=" + isCzyApple();
    }
}
