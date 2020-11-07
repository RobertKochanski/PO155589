package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia4;

public class Zadanie1c {
    public static void main(String[] args){
        String s = "abcdef";
        System.out.println("Napis s: " + s);
        System.out.println("Wynik: " + middle(s));
    }

    public static String middle(String str) {
        String wynik;
        if(str.length() % 2 == 0){
            int temp = str.length()/2;
            wynik = str.substring(temp-1, temp+1);
            return wynik;
        }
        int temp = str.length()/2;
        wynik = str.substring(temp, temp+1);
        return wynik;
    }
}
