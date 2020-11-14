package pl.imiajd.Kochanski;

public class Nauczyciel extends Osoba{
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double getPensja(){
        return pensja;
    }

    public String toString(){
        return super.getNazwisko() + " " + super.getRokUrodzenia() + " " + pensja;
    }
}
