package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

import java.util.Random;

public class Zadanie2b {
    public static void main(String[] args) {
        int[] tab = new int[22];
        generuj(tab, 22, -50, 50);
        System.out.println("Ile dodatnich: " + ileDodatnich(tab));
        System.out.println("Ile ujemnych: " + ileUjemnych(tab));
        System.out.println("Ile zerowych: " + ileZerowych(tab));
    }

    public static int getRandomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static void generuj(int[] tab, int n, int min, int max) {
        for (int i = 0; i < n; i++) {
            tab[i] = getRandomNum(min, max);
            //System.out.println(tab[i]);
        }
    }

    public static int ileDodatnich(int[] tab) {
        int ile = 0;
        for (int num : tab) {
            if (num > 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUjemnych(int[] tab){
        int ile = 0;
        for(int num: tab){
            if(num<0){
                ile++;
            }
        }
        return ile;
    }

    public static int ileZerowych(int[] tab){
        int ile = 0;
        for(int num: tab){
            if(num==0){
                ile++;
            }
        }
        return ile;
    }
}
