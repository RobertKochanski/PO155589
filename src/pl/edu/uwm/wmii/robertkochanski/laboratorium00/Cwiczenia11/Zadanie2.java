package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie2 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int temp = pracownicy.size();
        for(int i = 1; i<temp-1; i++){
            pracownicy.remove(n * i - i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Pracownik A");
        ll.add("Pracownik B");
        ll.add("Pracownik C");
        ll.add("Pracownik D");
        System.out.println(ll);
        redukuj(ll, 2);
        System.out.println(ll);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4);
        System.out.println(ll2);
        redukuj(ll2, 2);
        System.out.println(ll2);
    }
}
