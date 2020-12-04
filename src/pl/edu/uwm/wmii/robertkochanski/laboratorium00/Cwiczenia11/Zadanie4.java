package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie4 {
    public static <T> void odwroc(LinkedList<T> lista){
        int temp = lista.size();
        for(int i=0; i<temp; i++){
            lista.add(i, lista.get(lista.size()-1));
            lista.remove(temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        System.out.println(ll);
        odwroc(ll);
        System.out.println(ll);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(4);
        System.out.println(ll2);
        odwroc(ll2);
        System.out.println(ll2);
    }
}
