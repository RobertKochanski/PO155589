package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia5;

import java.util.ArrayList;

public class Zadanie4 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            x.add(i, i + 1);
        }
        System.out.println(x);
        System.out.println(reversed(x));
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> wynik = new ArrayList<>();
        for(int i=a.size()-1; i>=0; i--){
            wynik.add(a.get(i));
        }
        return wynik;
    }
}
