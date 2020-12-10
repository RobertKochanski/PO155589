package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie2 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
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

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4);
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        System.out.println(ll2);
        redukuj(ll2, 2);
        System.out.println(ll2);
    }
}
