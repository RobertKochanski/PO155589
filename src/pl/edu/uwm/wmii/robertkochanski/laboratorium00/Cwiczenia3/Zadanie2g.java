package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

import java.util.Random;

public class Zadanie2g {
    public static void main(String[] args) {
        int[] tab = new int[22];
        generuj(tab, 22, -50, 50);
        odwrocFragment(tab, 5, 10);
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

    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        int[] temp = new int[prawy-lewy+1];
        int t = 0;
        for(int i = lewy; i <= prawy; i++){
            temp[t] = tab[i];
            t++;
        }
        for(int i = lewy; i <= prawy; i++){
            tab[i] = temp[t-1];
            t--;
        }
        for(int num: tab){
            System.out.print(num + " ");
        }
    }
}
