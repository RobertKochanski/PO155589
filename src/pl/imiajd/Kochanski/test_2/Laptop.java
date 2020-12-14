package pl.imiajd.Kochanski.test_2;

import java.time.LocalDate;

public class Laptop extends Komputer implements Cloneable, Comparable<Komputer>{

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
        int x = super.compareTo(o);
        Laptop l = (Laptop)o;
        if(x == 0){
            if(isCzyApple() == l.isCzyApple()) return 0;
            if(isCzyApple()) return -1;
            return 1;
        }
        return x;
    }

    @Override
    public String toString() {
        return "nazwa= " + getNazwa() + ", dataProdukcji= " + getDataProdukcji() + ", czyApple=" + isCzyApple();
    }
}
