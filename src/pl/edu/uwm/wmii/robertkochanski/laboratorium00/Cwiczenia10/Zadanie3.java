package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

import java.time.LocalDate;

public class Zadanie3{

    public static void main(String[] args){
        Integer[] x = new Integer[]{1,2,3,4,5,6};
        Integer[] y = new Integer[]{2,4,3,1,4,5};
        System.out.println("isSorted x: " + ArrayUtil.isSorted(x));
        System.out.println("isSorted y: " + ArrayUtil.isSorted(y));

        LocalDate[] a = new LocalDate[2];
        a[0] = LocalDate.of(1997,3,14);
        a[1] = LocalDate.of(1995,5,24);
        LocalDate[] b = new LocalDate[2];
        b[0] = LocalDate.of(1995,5,24);
        b[1] = LocalDate.of(1997,3,14);
        System.out.println("isSorted a: " + ArrayUtil.isSorted(a));
        System.out.println("isSorted b: " + ArrayUtil.isSorted(b));
    }
}
