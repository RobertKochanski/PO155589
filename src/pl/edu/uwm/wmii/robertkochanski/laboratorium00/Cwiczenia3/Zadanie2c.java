package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia3;

import java.util.Random;

public class Zadanie2c {
    public static void main(String[] args){
        int[] tab = new int[22];
        generuj(tab, 22, -50, 50);
        System.out.println("Ilość: " + ileMaksymalnych(tab));
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

    public static int ileMaksymalnych(int[] tab) {
        int ile = 0;
        int najwieksza = tab[0];
        for(int num: tab){
            if(najwieksza < num){
                najwieksza = num;
            }
        }
        for(int num: tab){
            if(najwieksza == num){
                ile++;
            }
        }
        return ile;
    }
}
