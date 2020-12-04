package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia11;


public class Zadanie8 {
    public static <E> void print(E[] e){
        for(E i : e){
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args){
        String[] lista = new String[3];
        lista[0] = "1";
        lista[1] = "2";
        lista[2] = "3";
        print(lista);
    }


}
