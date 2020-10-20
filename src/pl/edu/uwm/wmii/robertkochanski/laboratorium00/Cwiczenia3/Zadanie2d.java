package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

import java.util.Random;

public class Zadanie2d {
    public static void main(String[] args){
        int[] tab = new int[22];
        generuj(tab, 22, -50, 50);
        System.out.println("Suma dodatnich: " + sumaDodatnich(tab));
        System.out.println("Suma ujemnych: " + sumaUjemnych(tab));
    }

    public static int getRandomNum(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

    public static void generuj(int[] tab, int n, int min, int max){
        for(int i=0; i<n; i++){
            tab[i] = getRandomNum(min, max);
            //System.out.println(tab[i]);
        }
    }

    public static int sumaDodatnich(int[] tab) {
        int suma = 0;
        for(int num: tab){
            if(num > 0){
                suma += num;
            }
        }
        return suma;
    }
    public static int sumaUjemnych(int[] tab) {
        int suma = 0;
        for(int num: tab){
            if(num < 0){
                suma += num;
            }
        }
        return suma;
    }
}
