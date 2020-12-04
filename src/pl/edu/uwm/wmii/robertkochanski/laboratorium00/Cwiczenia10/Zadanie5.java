package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

import java.time.LocalDate;

public class Zadanie5 {
    public static void main(String[] args){
        Integer[] a = new Integer[]{3,1,2};
        LocalDate[] b = new LocalDate[3];
        b[0] = LocalDate.of(2015,3,3);
        b[1] = LocalDate.of(1999,4,4);
        b[2] = LocalDate.of(2003,5,5);
        ArrayUtil.selectionSort(a);
        ArrayUtil.selectionSort(b);
        System.out.print("a: ");
        for(int i : a) System.out.print(i + " ");
        System.out.println();
        for(LocalDate i : b) System.out.println("b: " + i);
    }
}
