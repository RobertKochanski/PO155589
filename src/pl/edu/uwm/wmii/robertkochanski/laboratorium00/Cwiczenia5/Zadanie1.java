package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia5;

import java.util.ArrayList;

public class Zadanie1 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0; i<8; i++){
            x.add(i, i+1);
        }
        System.out.println(x);

        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0; i<3; i++){
            y.add(i, i+1);
        }
        System.out.println(y);

        System.out.println(append(x, y));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> wynik = new ArrayList<>();

        wynik.addAll(0, a);
        wynik.addAll(wynik.size(), b);

        return wynik;
    }
}
