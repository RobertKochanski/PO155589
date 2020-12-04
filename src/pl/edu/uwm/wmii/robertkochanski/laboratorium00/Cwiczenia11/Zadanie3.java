package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;

import java.util.LinkedList;

public class Zadanie3 {
    public static void odwroc(LinkedList<String> lista){
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
    }
}
