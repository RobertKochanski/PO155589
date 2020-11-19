package pl.imiajd.Kochanski.Cwiczenia7;

public class Adres {
    private String ulica;
    private String miasto;
    private String kod_pocztowy;
    private int numer_domu;
    private int numer_mieszkania;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(kod_pocztowy + ", " + miasto);
        System.out.println(ulica + ", " + numer_domu + ", " + numer_mieszkania);
    }

    public boolean przed(Adres adres){
        String[] x = kod_pocztowy.split("-");
        String[] y = adres.kod_pocztowy.split("-");
        if(Integer.parseInt(x[0]) < Integer.parseInt(y[0])) return true;
        if(Integer.parseInt(y[0]) < Integer.parseInt(x[0])) return false;
        return Integer.parseInt(x[1]) < Integer.parseInt(y[1]);
    }
}
