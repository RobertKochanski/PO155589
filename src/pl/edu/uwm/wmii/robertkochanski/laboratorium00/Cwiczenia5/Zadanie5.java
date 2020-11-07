package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia5;

import java.util.ArrayList;

public class Zadanie5 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            x.add(i, i + 1);
        }
        System.out.println(x);
        reverse(x);
    }

    public static void reverse(ArrayList<Integer> a){
        for (int i = 0, j = a.size() - 1; i < j; i++) {
            a.add(i, a.remove(j));
        }
        System.out.println(a);
    }
}
