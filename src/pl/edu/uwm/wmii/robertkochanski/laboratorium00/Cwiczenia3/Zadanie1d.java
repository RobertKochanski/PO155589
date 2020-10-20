package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

public class Zadanie1d {
    public static void main(String[] args){
        int[] tab = {-19, -18, 18, -17, 18, -16, -15, -14, 14, -13, -12,
                     11, 9, 10, 8, 7, 6, 5, -4, 3, 2, 1, 1, 0};
        int sumaU = 0;
        int sumaD = 0;

        for(int num: tab){
            if(num < 0){
                sumaU += num;
            }
            if(num > 0){
                sumaD += num;
            }
        }
        System.out.println("Suma dodatnich: " + sumaD);
        System.out.println("Suma ujemnych: " + sumaU);
    }
}
