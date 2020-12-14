package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Test_2;

import java.util.LinkedList;

public class Zadanie2 {
    public static void redukuj(LinkedList<String> komputery, int n){
        for(int i = n-1; i<komputery.size(); i += n-1){
            komputery.remove(i);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        int n = 3;
        System.out.println("Usuwanie co " + n + " komputer");
        ll.add("komputer 1");
        ll.add("komputer 2");
        ll.add("komputer 3");
        ll.add("komputer 4");
        ll.add("komputer 5");
        ll.add("komputer 6");
        ll.add("komputer 7");
        ll.add("komputer 8");
        System.out.println(ll);
        redukuj(ll, n);
        System.out.println(ll);
    }
}
