package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie1 {
    public static void redukuj(LinkedList<String> pracownicy, int n){
        for(int i = n-1; i<pracownicy.size(); i += n-1){
            pracownicy.remove(i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Pracownik 1");
        ll.add("Pracownik 2");
        ll.add("Pracownik 3");
        ll.add("Pracownik 4");
        ll.add("Pracownik 5");
        ll.add("Pracownik 6");
        ll.add("Pracownik 7");
        ll.add("Pracownik 8");
        System.out.println(ll);
        redukuj(ll, 2);
        System.out.println(ll);
    }
}
