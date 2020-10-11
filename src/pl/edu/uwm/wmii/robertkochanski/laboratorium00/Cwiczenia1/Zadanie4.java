package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia1;

public class Zadanie4 {
    public static void main(String[] args) {

        float suma = 1000;
        for (int i=0;i<3;i++){
            suma = (float) (suma + suma*0.06);
        }
        System.out.println(suma);
    }
}
