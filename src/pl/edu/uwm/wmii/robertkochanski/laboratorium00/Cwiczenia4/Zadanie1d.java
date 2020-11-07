package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1d {
    public static void main(String[] args){
        String s = "hoho";
        System.out.println("Napis s: " + s);
        System.out.println("Wynik: " + repeat(s, 2));
    }

    public static String repeat(String str, int n) {
        String wynik = "";
        for(int i=0; i<n; i++){
            wynik = wynik.concat(str);
        }
        return wynik;
    }
}
