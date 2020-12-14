package pl.imiajd.Kochanski.test_2;

import java.time.LocalDate;
import java.util.Objects;

public class Komputer implements Cloneable, Comparable<Komputer>{

    private String nazwa;
    private LocalDate dataProdukcji;

    public Komputer(String nazwa, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.dataProdukcji = dataProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komputer komputer = (Komputer) o;
        return Objects.equals(nazwa, komputer.nazwa) &&
                Objects.equals(dataProdukcji, komputer.dataProdukcji);
    }

    @Override
    public int compareTo(Komputer o){
        if(nazwa.equals(o.getNazwa())){
            return dataProdukcji.compareTo(o.getDataProdukcji());
        }
        return nazwa.compareTo(o.getNazwa());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Komputer c = (Komputer) super.clone();
        c.nazwa = nazwa;
        c.dataProdukcji = dataProdukcji;
        return c;
    }

    @Override
    public String toString() {
        return "nazwa= " + nazwa + ", dataProdukcji= " + dataProdukcji;
    }
}

