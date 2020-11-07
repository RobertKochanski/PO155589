package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia5;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie3 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0; i<8; i++){
            x.add(i, i+1);
        }
        System.out.println(x);

        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0; i<4; i++){
            y.add(i, i+3);
        }
        System.out.println(y);

        System.out.println(mergeSorted(x, y));
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> wynik = new ArrayList<>();
        int t = 0;
        if(a.size()<b.size()){
            for(int i=0; i<a.size(); i++){
                wynik.add(t, a.get(i));
                wynik.add(t+1, b.get(i));
                t+=2;
            }
            for(int j=a.size(); j<b.size(); j++){
                wynik.add(t, b.get(j));
                t++;
            }
        }

        if(a.size()>b.size()){
            for(int i=0; i<b.size(); i++){
                wynik.add(t, a.get(i));
                wynik.add(t+1, b.get(i));
                t+=2;
            }
            for(int j=b.size(); j<a.size(); j++){
                wynik.add(t, a.get(j));
                t++;
            }
        }
        Collections.sort(wynik);
        return wynik;
    }
}
