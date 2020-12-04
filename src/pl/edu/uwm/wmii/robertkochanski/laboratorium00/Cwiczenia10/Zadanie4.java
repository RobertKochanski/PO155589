package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;

import java.time.LocalDate;

public class Zadanie4{

    public static void main(String[] args){
        Integer[] a = new Integer[]{1,2,3,4,5,6};
        int a_search = 4;
        LocalDate[] b = new LocalDate[4];
        b[0] = LocalDate.of(1999,10,12);
        b[1] = LocalDate.of(2000,4,25);
        b[2] = LocalDate.of(2001,5,2);
        b[3] = LocalDate.of(2013,6,19);
        LocalDate b_search = LocalDate.of(2001,5,2);
        System.out.println("a: " + ArrayUtil.binSearch(a, a_search));
        System.out.println("b: " + ArrayUtil.binSearch(b, b_search));
    }
}
