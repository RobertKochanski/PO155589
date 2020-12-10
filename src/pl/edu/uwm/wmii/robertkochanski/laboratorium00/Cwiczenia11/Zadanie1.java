package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie1 {
    public static void redukuj(LinkedList<String> pracownicy, int n){
        int temp = pracownicy.size();
        for(int i = n-1; i<temp-1; i += n){
            pracownicy.remove(i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Pracownik A");
        ll.add("Pracownik B");
        ll.add("Pracownik C");
        ll.add("Pracownik D");
        System.out.println(ll);
        redukuj(ll, 3);
        System.out.println(ll);
    }
}
